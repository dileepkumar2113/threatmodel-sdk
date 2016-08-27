/*
 * This file is part of the ThreatModeling SDK.
 *
 * ThreatModeling SDK is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * ThreatModeling SDK is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * ThreatModeling SDK. If not, see http://www.gnu.org/licenses/.
 */
package us.springett.threatmodeling.model;

/**
 * The system must have something that the attacker is interested in; these
 * items/areas of interest are defined as assets. Assets are essentially threat
 * targets, i.e. they are the reason threats will exist. Assets can be both
 * physical assets and abstract assets.
 *
 * @since 1.0.0
 */
public class Asset {

    private String id;
    private String name;
    private String description;

    /**
     * Return the unique ID of the threat.
     * @return the unique ID of the threat.
     * @since 1.0.0
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique ID of the threat.
     * @param id the unique ID of the threat.
     * @since 1.0.0
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns a brief name of the asset.
     * @return a brief name of the asset.
     * @since 1.0.0
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a brief name of the asset.
     * @param name a brief name of the asset.
     * @since 1.0.0
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a detailed description of the asset.
     * @return a detailed description of the asset.
     * @since 1.0.0
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a detailed description of the asset.
     * @param description a detailed description of the asset.
     * @since 1.0.0
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
