
package file;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import domain.Car;


public class CarFile {
    
    //atributes
    public RandomAccessFile randomAccessFile;
    private int regsQuantity;//cantidad de registros en el archivo
    private int regSize;//tamanno del registro
    private String myFilePath;//ruta
    
    //constructor
    public CarFile(File file) throws IOException{
        //almaceno la ruta
        myFilePath = file.getPath();
        
        //indico el tamanno máximo
        this.regSize = 140;
        
        //una validación sencilla
        if(file.exists() && !file.isFile()){
            throw new IOException(file.getName() + " is an invalid file");
        }else{
            //crear la nueva instancia de RAF
            randomAccessFile = new RandomAccessFile(file, "rw");
            
            //necesitamos indicar cuantos registros tiene el archivo
            this.regsQuantity = 
                    (int)Math.ceil((double)randomAccessFile.length() / (double)regSize);
        }
    }//end method

    public CarFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //MUY IMPORTANTE cerrar nuestros archivos
    public void close() throws IOException{
        randomAccessFile.close();
        
    }
    
    //indicar la cantidad de registros de nuestro archivo
    public int fileSize(){
        return this.regsQuantity;
    }
    
    //insertar un nuevo registro en una posición específica
    public boolean putValue(int position, Car car) throws IOException{
        //primero: verificar que sea válida la inserción
        if(position < 0 && position > this.regsQuantity){
            System.err.println("1001 - Record position is out of bounds");
            return false;
        }else{
            if(car.sizeInBytes() > this.regSize){
                System.err.println("1002 - Record size is out of bounds");
                return false;
            }else{
                //BINGO
                randomAccessFile.seek(position * this.regSize);
                randomAccessFile.writeUTF(car.getName());
                randomAccessFile.writeInt(car.getYear());
                randomAccessFile.writeInt(car.getSequence());
                randomAccessFile.writeFloat(car.getMileage());
                randomAccessFile.writeBoolean(car.isIsAmerican());
                return true;
            }
        }
    }//end method
    
    //insertar al final del archivo
    public boolean addEndRecord(Car car) throws IOException{
        boolean success = putValue(this.regsQuantity, car);
        if(success){
            ++this.regsQuantity;
        }
        return success;
    }
    
    //obtener un carro
    public Car getCar(int position) throws IOException{
        //validar la posici'on
        if(position >= 0 && position <= this.regsQuantity){
            //colocamos el brazo en el lugar adecuado
            randomAccessFile.seek(position * this.regSize);
            
            //llevamos a cabo la lectura
            Car carTemp = new Car();
            carTemp.setName(randomAccessFile.readUTF());
            carTemp.setYear(randomAccessFile.readInt());
            carTemp.setSequence(randomAccessFile.readInt());
            carTemp.setMileage(randomAccessFile.readFloat());
            carTemp.setIsAmerican(randomAccessFile.readBoolean());
            
            if(carTemp.getName().equalsIgnoreCase("deleted")){
                return null;
            }else{
                return carTemp;
            }
        }else{
            System.err.println("1003 - position is out of bounds");
            return null;
        }
    }//end method
    
    //eliminar un carro
    public boolean deleteCar(int sequence) throws IOException{
        Car myCar;
        
        //buscar el carro
        for(int i = 0; i < this.regsQuantity; i++){
            //obtener el carro de la posicion actual
            myCar = this.getCar(i);
            
            
            //preguntar si es el carro que deseo eliminar
            if(myCar.getSequence()==sequence){
                //marcar como eliminado
                myCar.setName("deleted");
                myCar.setSequence(-1);
                myCar.setYear(-1);
                myCar.setMileage(-1);
                myCar.setIsAmerican(false);
                
                return this.putValue(i, myCar);
            }
        }
        return false;
    }
    
    //retornar una lista de carros
    public ArrayList<Car> getAllCars() throws IOException{
        ArrayList<Car> carsArray = new ArrayList<Car>();
        
        for(int i = 0; i < this.regsQuantity; i++){
            Car cTemp = this.getCar(i);
            
            if(cTemp != null){
                carsArray.add(cTemp);
            }
        }//end for
        return carsArray;
    }
    
    //encontrar y cargar la informacion del carro
    public boolean findAndWriteCar(Car addCar, int sequence) throws IOException{
        Car myCar;
        boolean found = false;
        
        for(int i=0; i<this.regsQuantity; i++){
            myCar = this.getCar(i);
            
            if(myCar.getSequence() == sequence){
                //getCar(i);
                found = true;
                randomAccessFile.seek(i* this.regSize);
                randomAccessFile.writeUTF(addCar.getName());
                randomAccessFile.writeInt(addCar.getYear());
                randomAccessFile.writeInt(addCar.getSequence());
                randomAccessFile.writeFloat(addCar.getMileage());
                randomAccessFile.writeBoolean(addCar.isIsAmerican());
                
            }//fin if
               
        }//fin for
        
        return found;
        }//fin findCar
    
    public boolean findCar(int sequence) throws IOException{
        Car myCar;
        
        
        for(int i=0; i<this.regsQuantity; i++){
            myCar = this.getCar(i);
            
            
            if(myCar.getSequence() == sequence)
   
                return true;
     
        }//fin for
        
        return false;
        }//fin findCar
    
    public void updateCar(String name, int year, boolean american, int sequence) throws IOException{
        
        Car myCar;
        if(findCar(sequence) == true){
            for(int i=0; i<this.regsQuantity; i++){
            myCar = this.getCar(i);
            
              if(myCar.getSequence()==sequence){ 
                myCar.setName(name);
                myCar.setYear(year);
                myCar.setIsAmerican(american);
                this.putValue(i, myCar);
              }
            }
        }
    }

}//fin de la clase

    

