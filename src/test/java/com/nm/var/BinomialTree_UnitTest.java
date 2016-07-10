package com.nm.var;

import org.junit.Before;
import org.junit.Test;

public class BinomialTree_UnitTest {
    //private BinomialTree bt;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldCreateBinomialTreeCorrectly() {
        double t = 5.0 / 12.0;
        BinomialTree bt = new BinomialTree(50, 50, t, 0.4, 0.1, VarUtils.AMERICAN_PUT);
        bt.buildStockPriceTree();
    }

}
