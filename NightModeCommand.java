class NightModeCommand implements Command {
    private Command[] commands;

    public NightModeCommand(Command... commands){
        this.commands = commands;
    }
    @Override
    public void execute(){
        System.out.println("[System] Activating Night Mode");
        for (Command cmd : commands){
            cmd.execute();
        }
    }
    @Override
    public void undo(){
        System.out.println("[System] Deactivating Night Mode");
        for (int i = commands.length - 1; i >= 0; i--){
            commands[i].undo();
        }
    }
}
