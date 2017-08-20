package fr.nukerhd.ultime.api.database;

import fr.nukerhd.ultime.api.player.UltimePlayer;
import fr.nukerhd.ultime.api.player.rank.UltimeRank;
import org.bukkit.entity.Player;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.UUID;

/**
 * Crée le 20/08/2017 par NukerHD pour UltimeProject !
 */
public class MySQL
{
    
    private String host, username, password;
    private int port;
    
    private Connection connection;
    
    public MySQL(String host, String username, String password)
    {
        this.host = host;
        this.username = username;
        this.password = password;
    }
    
    public MySQL(String host, int port, String username, String password)
    {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }
    
    public void connect()
    throws
    Exception
    {
        if (!isConnected())
        {
            connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port, username, password);
            return;
        }
        throw new MySQLException("Already connected");
    }
    
    public void disconnect()
    throws
    Exception
    {
        if (isConnected())
        {
            connection.close();
            return;
        }
        throw new MySQLException("Already disconnected");
    }
    
    public boolean isConnected()
    {
        return connection != null;
    }
    
    public UltimePlayer getPlayer(Player player)
            throws Exception
    {
        PreparedStatement query = connection.prepareStatement("SELECT * FROM players WHERE uuid = ?");
        query.setString(1, player.getUniqueId().toString());
        ResultSet results = query.executeQuery();
        
        int rank, coins, supercoins;
        
        /*
        
        Structure de la table 'players'
        
        id
        uuid
        rank
        coins
        supercoins
        creation_date

         */
        
        while(results.next())
        {
        
        }
        query.close();
        return new UltimePlayer(player);
    }
    
    private class MySQLException
            extends Exception
    {
        public MySQLException(String message)
        {
            super(message);
        }
    }
    
}
