const baseConfig = require('@eclipse-scout/cli/scripts/webpack-defaults');

module.exports = (env, args) => {
  args.resDirArray = ['src/main/resources/WebContent', 'node_modules/@eclipse-scout/core/res'];
  const config = baseConfig(env, args);

  config.entry = {
    'anippe': './src/main/js/anippe.js',
    'login': './src/main/js/login.js',
    'logout': './src/main/js/logout.js',
    'anippe-theme': './src/main/js/anippe-theme.less',
    'anippe-theme-dark': './src/main/js/anippe-theme-dark.less'
  };

  return config;
};
