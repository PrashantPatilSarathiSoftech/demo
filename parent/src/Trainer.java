public class Trainer {
    private  Integer trainerId;
    private  String trainerName;

    public Trainer(Integer trainerId, String trainerName) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", trainerName='" + trainerName + '\'' +
                '}';
    }
}

