public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator{
    public TaxPayingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.printf("Decorate "+worker.getName()+" with TaxPaying.\n");
    }

    @Override
    public double getPrice() {
        return (super.getPrice() * 0.1) + super.getPrice();
    }
}