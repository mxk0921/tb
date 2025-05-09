package com.taobao.desktop.widget.template.standard;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WidgetStandardData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String deepLink;
    private ExtData ext;
    private String imageUrl;
    private long nextRefreshTime;
    private String overlayImageUrl;
    private String overlayMaterialUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class ExtData implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<ContainersData> containers;
        private int templateType;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class ContainersData implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private String collect;
            private String collectBgUrl;
            private String collectColor;
            private String contentBgUrl;
            private String contentImageUrl;
            private String deepLink;
            private String description;
            private String descriptionColor;
            private String squareContentImageUrl;
            private String tag;
            private String tagBgColor;
            private String tagBgGradient;
            private String tagBgUrl;
            private String tagColor;
            private String title;
            private String titleBgUrl;
            private String titleColor;

            static {
                t2o.a(437256330);
            }

            public String getCollect() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("9c95f285", new Object[]{this});
                }
                return this.collect;
            }

            public String getCollectBgUrl() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("60a49663", new Object[]{this});
                }
                return this.collectBgUrl;
            }

            public String getCollectColor() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("70b1bb8a", new Object[]{this});
                }
                return this.collectColor;
            }

            public String getContentBgUrl() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("e8d6d4f2", new Object[]{this});
                }
                return this.contentBgUrl;
            }

            public String getContentImageUrl() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("9c918be2", new Object[]{this});
                }
                return this.contentImageUrl;
            }

            public String getDeepLink() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("2eb98bfd", new Object[]{this});
                }
                return this.deepLink;
            }

            public String getDescription() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("b9cffbf3", new Object[]{this});
                }
                return this.description;
            }

            public String getDescriptionColor() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("9f0a66dc", new Object[]{this});
                }
                return this.descriptionColor;
            }

            public String getSquareContentImageUrl() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("f9b49e1f", new Object[]{this});
                }
                return this.squareContentImageUrl;
            }

            public String getTag() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
                }
                return this.tag;
            }

            public String getTagBgColor() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("be0b7e1f", new Object[]{this});
                }
                return this.tagBgColor;
            }

            public String getTagBgGradient() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("e6393680", new Object[]{this});
                }
                return this.tagBgGradient;
            }

            public String getTagBgUrl() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("e4dfdd3", new Object[]{this});
                }
                return this.tagBgUrl;
            }

            public String getTagColor() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("1e5b22fa", new Object[]{this});
                }
                return this.tagColor;
            }

            public String getTitle() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
                }
                return this.title;
            }

            public String getTitleBgUrl() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("dc1b6491", new Object[]{this});
                }
                return this.titleBgUrl;
            }

            public String getTitleColor() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("ec2889b8", new Object[]{this});
                }
                return this.titleColor;
            }

            public void setCollect(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd2be6f9", new Object[]{this, str});
                } else {
                    this.collect = str;
                }
            }

            public void setCollectBgUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("448caa73", new Object[]{this, str});
                } else {
                    this.collectBgUrl = str;
                }
            }

            public void setCollectColor(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("36242a2c", new Object[]{this, str});
                } else {
                    this.collectColor = str;
                }
            }

            public void setContentBgUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c2a23dc4", new Object[]{this, str});
                } else {
                    this.contentBgUrl = str;
                }
            }

            public void setContentImageUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("afc7c53c", new Object[]{this, str});
                } else {
                    this.contentImageUrl = str;
                }
            }

            public void setDeepLink(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("33554e19", new Object[]{this, str});
                } else {
                    this.deepLink = str;
                }
            }

            public void setDescription(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("97e6b14b", new Object[]{this, str});
                } else {
                    this.description = str;
                }
            }

            public void setDescriptionColor(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7e85031a", new Object[]{this, str});
                } else {
                    this.descriptionColor = str;
                }
            }

            public void setSquareContentImageUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("933a539f", new Object[]{this, str});
                } else {
                    this.squareContentImageUrl = str;
                }
            }

            public void setTag(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
                } else {
                    this.tag = str;
                }
            }

            public void setTagBgColor(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7a4dcd37", new Object[]{this, str});
                } else {
                    this.tagBgColor = str;
                }
            }

            public void setTagBgGradient(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("158d7b5e", new Object[]{this, str});
                } else {
                    this.tagBgGradient = str;
                }
            }

            public void setTagBgUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("464f1703", new Object[]{this, str});
                } else {
                    this.tagBgUrl = str;
                }
            }

            public void setTagColor(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("37e696bc", new Object[]{this, str});
                } else {
                    this.tagColor = str;
                }
            }

            public void setTitle(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
                } else {
                    this.title = str;
                }
            }

            public void setTitleBgUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1e3ab505", new Object[]{this, str});
                } else {
                    this.titleBgUrl = str;
                }
            }

            public void setTitleColor(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd234be", new Object[]{this, str});
                } else {
                    this.titleColor = str;
                }
            }
        }

        static {
            t2o.a(437256329);
        }

        public List<ContainersData> getContainers() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("ba5005d8", new Object[]{this});
            }
            return this.containers;
        }

        public int getTemplateType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8b9c64c4", new Object[]{this})).intValue();
            }
            return this.templateType;
        }

        public void setContainers(List<ContainersData> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50879b8c", new Object[]{this, list});
            } else {
                this.containers = list;
            }
        }

        public void setTemplateType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c386b4c6", new Object[]{this, new Integer(i)});
            } else {
                this.templateType = i;
            }
        }
    }

    static {
        t2o.a(437256328);
    }

    public String getDeepLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2eb98bfd", new Object[]{this});
        }
        return this.deepLink;
    }

    public ExtData getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtData) ipChange.ipc$dispatch("e24aa4bf", new Object[]{this});
        }
        return this.ext;
    }

    public String getImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        return this.imageUrl;
    }

    public long getNextRefreshTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3c0fa1a", new Object[]{this})).longValue();
        }
        return this.nextRefreshTime;
    }

    public String getOverlayImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a86ff6b", new Object[]{this});
        }
        return this.overlayImageUrl;
    }

    public String getOverlayMaterialUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4183556b", new Object[]{this});
        }
        return this.overlayMaterialUrl;
    }

    public void setDeepLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33554e19", new Object[]{this, str});
        } else {
            this.deepLink = str;
        }
    }

    public void setExt(ExtData extData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5db0181", new Object[]{this, extData});
        } else {
            this.ext = extData;
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            this.imageUrl = str;
        }
    }

    public void setNextRefreshTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1f06a", new Object[]{this, new Long(j)});
        } else {
            this.nextRefreshTime = j;
        }
    }

    public void setOverlayImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a080c2d3", new Object[]{this, str});
        } else {
            this.overlayImageUrl = str;
        }
    }

    public void setOverlayMaterialUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b9136b", new Object[]{this, str});
        } else {
            this.overlayMaterialUrl = str;
        }
    }
}
