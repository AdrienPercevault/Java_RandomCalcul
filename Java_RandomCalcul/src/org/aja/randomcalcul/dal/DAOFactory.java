package org.aja.randomcalcul.dal;

import org.aja.randomcalcul.domain.Account;
import org.aja.randomcalcul.domain.Random;

import java.sql.SQLException;

public class DAOFactory {

    private DAOFactory() {

    }

    public static IDAO<Account, Long> getAccountDAO() throws SQLException {
        return new DAO<Account, Long>(Account.class);
    }
}