package org.kie.pmml.pmml_4_2.model;

public class ExternalBeanDefinition {

    private String beanPackageName;
    private String beanName;

    public ExternalBeanDefinition(String beanInfo) {
        int lastPos = beanInfo.lastIndexOf(".");
        this.beanPackageName = beanInfo.substring(0, lastPos);
        this.beanName = beanInfo.substring(lastPos + 1);
    }

    public ExternalBeanDefinition(String beanPackageName, String beanName) {
        super();
        this.beanPackageName = beanPackageName;
        this.beanName = beanName;
    }

    public String getBeanPackageName() {
        return beanPackageName;
    }

    public void setBeanPackageName(String beanPackageName) {
        this.beanPackageName = beanPackageName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getQualifiedBeanName() {
        return beanPackageName + "." + beanName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((beanName == null) ? 0 : beanName.hashCode());
        result = prime * result + ((beanPackageName == null) ? 0 : beanPackageName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ExternalBeanDefinition other = (ExternalBeanDefinition) obj;
        if (beanName == null) {
            if (other.beanName != null) {
                return false;
            }
        } else if (!beanName.equals(other.beanName)) {
            return false;
        }
        if (beanPackageName == null) {
            if (other.beanPackageName != null) {
                return false;
            }
        } else if (!beanPackageName.equals(other.beanPackageName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExternalBeanDefinition [beanPackageName=" + beanPackageName + ", beanName=" + beanName + ", qualifiedBeanName=" + getQualifiedBeanName() + "]";
    }
}
