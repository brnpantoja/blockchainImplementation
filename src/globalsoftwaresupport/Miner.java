package globalsoftwaresupport;

public class Miner {
    private int reward;

    public void mine(Block block, BlockChain blockChain) {
        // minerar o bloco
        // enquanto o hash não começar com tantos zeros quanto a dificuldade
        while (!isGoldenHash(block)) {
            block.incrementNonce();
            block.generateHash();
        }
        System.out.println(block + " acabou de minerar...");
        System.out.println("Bloco minerado: " + block.getHash());
        // adicionar o bloco à cadeia de blocos
        blockChain.addBlock(block);
        // recompensa para o minerador
        reward += Constants.REWARD;
    }

    private boolean isGoldenHash(Block block) {
        String leadingZeros = new String(new char[Constants.DIFFICULTY]).replace('\0', '0');
        return block.getHash().substring(0, Constants.DIFFICULTY).equals(leadingZeros);
    }
    public double getReward() {
        return this.reward;
    }
}
