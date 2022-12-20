'use strict';

/**
 * extension router
 */

const { createCoreRouter } = require('@strapi/strapi').factories;

module.exports = createCoreRouter('api::extension.extension');
