package exercicio1;
public class Carro {
    private String brand;
    private String model;
    private double fuel;
    private double avgConsumption;
    private int km;

    public Carro(String brand, String model, double avgConsumption) {
        setBrand(brand);
        setModel(model);
        setConsumption(avgConsumption);
    }

    public Carro(String brand, String model, double fuel, double avgConsumption, int km) {
        setBrand(brand);
        setModel(model);
        setFuel(fuel);
        setConsumption(avgConsumption);
        setKm(km);
    }

    public String setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            this.brand = "ERRO: Marca não informada!";
            return this.brand;
        } else {
            this.brand = brand;
            return this.brand;
        }
    }

    public String setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            this.model = "ERRO: Modelo não informada!";
            return this.model;
        } else {
            this.model = model;
            return this.model;
        }
    }

    public String setConsumption(double avgConsumption) {
        if (avgConsumption < 0) {
            return "ERRO: Consumo inválido\nPor favor tente novamente.";
        } else {
            this.avgConsumption = avgConsumption;
            return "Consumo definido: " + this.avgConsumption;
        }
    }

    public String setFuel(double fuel) {
        if (fuel < 0) {
            this.fuel = 0;
            return "ERRO: Quantidade de combustível inválida.\nIniciando com 0.";
        } else {
            this.fuel = fuel;
            return "Combustível definido: " + this.fuel;
        }
    }

    public String setKm(int km) {
        if (km < 0) {
            this.km = 0;
            return "ERRO: Quilometragem inválida.\nIniciando com 0.";
        } else {
            this.km = km;
            return "Km definido: " + this.km;
        }
    }

    public String Drive(int drive) {
        if (drive <= 0) {
            return "O carro é incapaz de percorrer 0km.\nPor favor tente novamente.";
        } else if ((drive / avgConsumption) > fuel) {
            return "Combustível insuficiente para percorrer o trajeto.\nPor favor abasteça e tente novamente.";
        } else {
            this.fuel -= (drive / avgConsumption);
            this.km += drive;
            return "O carro andou " + drive + " km";
        }
    }

    public String Refuel(double gasStation) {
        if (gasStation > 0) {
            this.fuel += gasStation;
            return "Foram abastecidos " + gasStation + "L.\nO tanque agora contém " + this.fuel;
        } else {
            return "Valor inválido para reabastecimento.\nPor favor tente novamente.";
        }
    }

    public String show() {
        return "O carro " + brand + " " + model + " contém " + (int) fuel + "L após percorrer " + km + " gastando "
                + avgConsumption + " por km.";
    }
}