/*const person=require('./person');
const per=require('./persondetails');
console.log(person.age);

console.log(per.name);*/

/*const logger = require('./logger_demo');
//const Logger = require('./logger_example');

const log = new logger();
log.on('message',(data)=> console.log('called listener',data));

log.log('Hello');*/

const Logger = require('./logger');

const logger = new Logger();
logger.on('message',(data)=>console.log('called listener',data));
logger.log('Welcome  to NodeJS')
