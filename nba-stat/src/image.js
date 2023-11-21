const assets = require.context('./assets/images', true);
const images = {};
assets.keys().forEach((filename) => {
    const image = assets(filename);
    const name = filename.replace('./', '');
    images[name] = image;
});
export default images;