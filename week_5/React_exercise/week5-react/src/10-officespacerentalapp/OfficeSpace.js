function OfficeSpace() {

    const officeList = [
        {
            Name: "Sky Tower",
            Rent: 55000,
            Address: "Chennai"
        },
        {
            Name: "Tech Park",
            Rent: 75000,
            Address: "Bangalore"
        },
        {
            Name: "Business Hub",
            Rent: 45000,
            Address: "Hyderabad"
        }
    ];

    const image =
        "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=800";

    return (
        <div>

            <h1>Office Space Rental App</h1>

            <img
                src={image}
                alt="Office"
                width="400"
                height="250"
            />

            <hr />

            {officeList.map((office, index) => (

                <div key={index}>

                    <h2>{office.Name}</h2>

                    <p>
                        <b>Address:</b> {office.Address}
                    </p>

                    <p
                        style={{
                            color:
                                office.Rent < 60000
                                    ? "red"
                                    : "green"
                        }}
                    >
                        <b>Rent:</b> ₹{office.Rent}
                    </p>

                    <hr />

                </div>

            ))}

        </div>
    );
}

export default OfficeSpace;