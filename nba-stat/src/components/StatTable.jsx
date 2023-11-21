import React from 'react'

import images from '../image'

const StatTable = () => {
  const [stat, setStat] = React.useState([])
  React.useEffect(() => { 
    setStat([
      {
        classement: 1,
        joueur: 'Joel Embiid',
        joueur_image: 'joel_embiid.png',
        equipe: 'PHI',
        m: 13,
        mj: 13,
        ppm: 31.9,
        rpm: 11.2,
        pdpm: 6.2,
        mpm: 34.1,
        eff: 36.4,
        fg: 50.2,
        p3: 31.8,
        lf: 88.5
      }
    ])
  }, [])

  return (
      <div className='table-responsive'>
          <table className="table table-striped">
              <thead className="px-2 table-bordered table-dark">
                  <tr className='text-white'>
                    <th scope="col">Classement</th>
                    <th scope="col">Joueur</th>
                    <th scope="col">Equipe</th>
                    <th scope="col">M</th>
                    <th scope="col">MJ</th>
                    <th scope="col">PPM</th>
                    <th scope="col">RPM</th>
                    <th scope="col">PDPM</th>
                    <th scope="col">MPM</th>
                    <th scope="col">EFF</th>
                    <th scope="col">FG%</th>
                    <th scope="col">3P%</th>
                    <th scope="col">LF%</th>
                  </tr>
              </thead>
            <tbody className="px-2">
              {stat.map((item, index) => {
                return (
                  <tr>
                    <td>{item.classement}</td>
                    <td>
                      <div className='d-flex justify-content-center align-items-center'>
                        <img src={images[item.joueur_image]} className='img-fluid me-2' height='35px' width='35px' alt={'Player ' + item.joueur} />
                        <span className='ms-2'>{item.joueur}</span>
                      </div>
                    </td>
                    <td>{item.equipe}</td>
                    <td>{item.m}</td>
                    <td>{item.mj}</td>
                    <td>{item.ppm}</td>
                    <td>{item.rpm}</td>
                    <td>{item.pdpm}</td>
                    <td>{item.mpm}</td>
                    <td>{item.eff}</td>
                    <td>{item.fg}</td>
                    <td>{item.p3}</td>
                    <td>{item.lf}</td>
                  </tr>
                )
              })}
            </tbody>
          </table>
    </div>
  )
}

export default StatTable