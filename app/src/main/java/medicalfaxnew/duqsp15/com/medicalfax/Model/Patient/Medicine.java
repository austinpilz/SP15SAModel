public class Medicine {

	private String medicine; // this is the medicine the patient is taking
	private String medicineCourse; // this is the period of time the medication
									// is prescribed
	private String medicineCompletedCourse; // this is how much medicine the
											// patient has actually taken

	/**
	 * Constructor for class. We are requiring that all fields for the medicine
	 * are met
	 * 
	 * @param medicine
	 *            - name of the prescribed medicine (String)
	 * @param medicineCourse
	 *            - how the medicine is to be taken over time (String)
	 * @param medicineCompletedCourse
	 *            - how much the patient has taken (String)
	 */
	public Medicine(String medicine, String medicineCourse,
			String medicineCompletedCourse) {
		medicine = this.medicine;
		medicineCourse = this.medicineCourse;
		// this might be easier to implement by using the dates...
		medicineCompletedCourse = this.medicineCompletedCourse;
	}

	/**
	 * Setters
	 */

	/**
	 * 
	 * @param newMedicine
	 */
	public void setMedicine(String newMedicine) {
		medicine = newMedicine;
	}

	
	/**
	 * 
	 * @param newMedicineCourse
	 */
	public void setMedicineCourse(String newMedicineCourse) {
		medicineCourse = newMedicineCourse;
	}

	/**
	 * 
	 * @param newMedicineCompletedCourse
	 */
	public void setMedicinCompletedCourse(String newMedicineCompletedCourse) {
		medicineCompletedCourse = newMedicineCompletedCourse;
	}

	/**
	 * Getters
	 */

	
	/**
	 * 
	 * @return
	 */
	public String getMedicine() {
		return medicine;
	}

	/**
	 * 
	 * @return
	 */
	public String getMedicineCourse() {
		return medicineCourse;
	}

	/**
	 * 
	 * @return
	 */
	public String getMedicineCompletedCourse() {
		return medicineCompletedCourse;
	}

}
