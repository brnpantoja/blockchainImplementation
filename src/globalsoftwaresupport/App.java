package globalsoftwaresupport;

public class App {
    public static void main(String[] args) {

        BlockChain blockChain = new BlockChain();
        Miner miner = new Miner();

        // podemos criar os blocos um por um
        Block block0 = new Block(0, "", Constants.GENESIS_PREV_HASH);
        miner.mine(block0, blockChain);

        Block block1 = new Block(1, "transacao1", blockChain.getBlockChain().
                get(blockChain.getSize() - 1).getHash());
        miner.mine(block1, blockChain);

        Block block2 = new Block(2, "transacao2", blockChain.getBlockChain().
                get(blockChain.getSize() - 1).getHash());
        miner.mine(block2, blockChain);

        System.out.println("\n" + "BLOCKCHAIN:\n" + blockChain);
        System.out.println("Recompensa de mineracao: " + miner.getReward());
        // um unico bloco é extraido a cada 10 min

    }
}
