function IndianPlayers() {

    const T20players = [
        "Virat",
        "Rohit",
        "Hardik"
    ];

    const RanjiPlayers = [
        "Pujara",
        "Rahane",
        "Iyer"
    ];

    const mergedPlayers = [...T20players, ...RanjiPlayers];

    const players = [
        "Virat",
        "Rohit",
        "Gill",
        "Rahul",
        "Pant",
        "Hardik"
    ];

    const oddPlayers = players.filter((player, index) => index % 2 === 0);
    const evenPlayers = players.filter((player, index) => index % 2 !== 0);

    return (
        <div>

            <h2>Odd Team Players</h2>

            {oddPlayers.map((player, index) => (
                <p key={index}>{player}</p>
            ))}

            <h2>Even Team Players</h2>

            {evenPlayers.map((player, index) => (
                <p key={index}>{player}</p>
            ))}

            <hr />

            <h2>Merged Players</h2>

            {mergedPlayers.map((player, index) => (
                <p key={index}>{player}</p>
            ))}

        </div>
    );
}

export default IndianPlayers;