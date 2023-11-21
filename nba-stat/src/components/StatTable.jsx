import React from 'react'

import images from '../image'

const StatTable = () => {
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
                  <tr>
                    <td>1</td>
                      <td>
                          <div className='d-flex justify-content-center align-items-center'>
                <img src={images['joel_embiid.png']} className='img-fluid me-2' height='35px' width='35px' alt='Player Joel Embiid' />
                <span className='ms-2'>Joel Embiid</span>
                          </div>
                    </td>
                    <td>Equipe 1</td>
                    <td>13</td>
                    <td>13</td>
                    <td>31.9</td>
                    <td>11.2</td>
                    <td>6.2</td>
                    <td>34.1</td>
                    <td>36.4</td>
                    <td>50.2</td>
                    <td>31.8</td>
                    <td>88.5</td>
                  </tr>
              </tbody>
          </table>
    </div>
  )
}

export default StatTable