package zhongjiezhe_mode;

public abstract class user {
    public Meditor getMeditor() {
		return meditor;
	}

	public user(Meditor meditor) {
		this.meditor = meditor;
	}

	private Meditor meditor;
	public abstract void work();
}
