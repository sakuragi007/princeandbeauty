/**
 * @(#)Config.java, 2017/6/5.
 * <p/>
 * Copyright 2017 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * @author 王寒冰
 */
@Component
@ConfigurationProperties(prefix = "app.devtools")
public class DevtoolsConfig {

    private Restart restart;

    private Remote remote;

    public void setRestart(Restart restart) {
        this.restart = restart;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public Restart getRestart() {
        return restart;
    }

    public Remote getRemote() {
        return remote;
    }

    public static class Remote {
        private Debug debug;

        public Debug getDebug() {
            return debug;
        }

        public void setDebug(Debug debug) {
            this.debug = debug;
        }

        @Override
        public String toString() {
            return "Remote{" +
                    "debug=" + debug +
                    '}';
        }

        public static class Debug {

            private Integer localPort;

            public Integer getLocalPort() {
                return localPort;
            }

            public void setLocalPort(Integer localPort) {
                this.localPort = localPort;
            }

            @Override
            public String toString() {
                return "Debug{" +
                        "localPort=" + localPort +
                        '}';
            }
        }

    }

    public static class Restart {
        private Boolean enabled;

        private String additionalExclude;

        private String additionalPaths;

        private String triggerFile;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public String getAdditionalExclude() {
            return additionalExclude;
        }

        public void setAdditionalExclude(String additionalExclude) {
            this.additionalExclude = additionalExclude;
        }

        public String getAdditionalPaths() {
            return additionalPaths;
        }

        public void setAdditionalPaths(String additionalPaths) {
            this.additionalPaths = additionalPaths;
        }

        public String getTriggerFile() {
            return triggerFile;
        }

        public void setTriggerFile(String triggerFile) {
            this.triggerFile = triggerFile;
        }

        @Override
        public String toString() {
            return "Restart{" +
                    "enabled=" + enabled +
                    ", additionalExclude='" + additionalExclude + '\'' +
                    ", additionalPaths='" + additionalPaths + '\'' +
                    ", triggerFile='" + triggerFile + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "DevtoolsConfig{" +
                "restart=" + restart +
                ", remote=" + remote +
                '}';
    }
}
