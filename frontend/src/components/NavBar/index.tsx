import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './style.css';

function NavBar() {
    return (
        <header>
            <nav className='container'>
                <div className='dsmovie-nav-content'>
                    <h1>DSMovie</h1>
                    <a href="https://github.com/lucianodefranca">
                        <div className='dsmovie-contact-container'>
                            <GithubIcon />
                            <p className='dsmovie-contact-link'>/lucianodefranca</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    )
}

export default NavBar;