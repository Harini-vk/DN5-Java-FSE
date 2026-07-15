import React, { Component } from "react";

import Guest from "./Guest";
import User from "./User";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";

class Greeting extends Component {

    constructor(props) {
        super(props);

        this.state = {
            isLoggedIn: false
        };
    }

    login = () => {
        this.setState({
            isLoggedIn: true
        });
    };

    logout = () => {
        this.setState({
            isLoggedIn: false
        });
    };

    render() {

        if (this.state.isLoggedIn) {
            return (
                <div>

                    <User />

                    <LogoutButton
                        onClick={this.logout}
                    />

                </div>
            );
        }

        return (
            <div>

                <Guest />

                <LoginButton
                    onClick={this.login}
                />

            </div>
        );
    }
}

export default Greeting;