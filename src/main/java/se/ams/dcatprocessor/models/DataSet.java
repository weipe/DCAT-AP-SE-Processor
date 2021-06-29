/*
 * This file is part of dcat-ap-se-processor.
 *
 * dcat-ap-se-processor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * dcat-ap-se-processor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with dcat-ap-se-processor.  If not, see <https://www.gnu.org/licenses/>.
 */

package se.ams.dcatprocessor.models;


import java.util.ArrayList;
import java.util.List;

public class DataSet extends DataService {
    public List<Distribution> dcat_distribution = new ArrayList<>();
    public List<DataClass> spatial = new ArrayList<>();
    public List<DataClass> temporals = new ArrayList<>();
    public List<DataClass> offers = new ArrayList<>();
    public List<DataClass> qualifiedRelations = new ArrayList<>();
    public DataClass creator;
    public List<DataClass> otherAgents = new ArrayList<>();
    public List<DataClass> provenances = new ArrayList<>();
}


