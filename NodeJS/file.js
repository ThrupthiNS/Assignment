const fs = require('fs');
const path = require('path');

/*fs.mkdir(path.join(__dirname,'/Training_Details'),{},

function(err){

    if(err) throw err;

    console.log('');

}

)*/

fs.writeFile(path.join(__dirname,'/Training_Details','Student.txt'),'Student name is Thrupthi N S',

(err) => {

    if(err) throw err;

    console.log('File Written...')

} );

