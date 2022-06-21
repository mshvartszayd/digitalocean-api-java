/**
 * The MIT License
 *
 * <p>Copyright (c) 2013-2020 Jeevanandam M. (jeeva@myjeeva.com)
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.myjeeva.digitalocean.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.myjeeva.digitalocean.common.ResourceStatus;
import com.myjeeva.digitalocean.common.ResourceType;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Map;

/**
 *
 */
public class ProjectResource {

  @Expose
  @SerializedName("urn")
  private String urn;

  @Expose
  @SerializedName("assigned_at")
  private String assignedAt;

  @Expose
  @SerializedName("links")
  private Map<String, String> links;

  @Expose
  @SerializedName("status")
  private ResourceStatus status;

  public ProjectResource() {}

  public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public String getAssignedAt() {
    return assignedAt;
  }

  public void setAssignedAt(String assignedAt) {
    this.assignedAt = assignedAt;
  }

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }

  public ResourceStatus getStatus() {
    return status;
  }

  public void setStatus(ResourceStatus status) {
    this.status = status;
  }
}
