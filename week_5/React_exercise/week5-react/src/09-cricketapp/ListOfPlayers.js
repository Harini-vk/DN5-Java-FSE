function ListOfPlayers() {
    const players = [
        { name: "Virat", score: 90 },
        { name: "Rohit", score: 45 },
        { name: "Gill", score: 75 },
        { name: "Rahul", score: 60 },
        { name: "Pant", score: 80 },
        { name: "Hardik", score: 95 },
        { name: "Jadeja", score: 55 },
        { name: "Ashwin", score: 65 },
        { name: "Shami", score: 72 },
        { name: "Bumrah", score: 88 },
        { name: "Siraj", score: 50 }
    ];

    const lowScorePlayers = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>

            {players.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}

            <hr />

            <h2>Players with Score Below 70</h2>

            {lowScorePlayers.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}
        </div>
    );
}

export default ListOfPlayers;