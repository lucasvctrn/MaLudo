'use strict';

/**
 * extension service
 */

const { createCoreService } = require('@strapi/strapi').factories;

module.exports = createCoreService('api::extension.extension');
