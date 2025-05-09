package com.taobao.share.core.contacts.mtop.response;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ComTaobaoGetContactsMessageResponseData implements IMTOPDataObject, Serializable {
    private DataBean data;
    public String shareTraceId;

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class DataBean implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String abtestParam;
        private List<ContactsBean> contacts;
        public String pvid;
        private String recPicUrl;
        public String scm;
        private BubbleTipsBean tips;

        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class ContactsBean implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private String bizSubType;
            private String ccode;
            private String contactType;
            private String dataType;
            private String displayName;
            private ExtraBean extra;
            private String groupId;
            private String groupUserNum;
            private String headIcon;
            private String headUrl;
            private String isFriend;
            private String isGuideSaoHuo;
            private String mobilePhone;
            private String nick;
            private String oldGroupId;
            private String recordNum;
            private String shareChannel;
            private String sourceType;
            private String updateTime;
            private String userId;

            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public static class ExtraBean implements Serializable {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private String friendType;
                private GuideSaoHuoDataBean guideSaoHuoData;
                private String possibleFriendSource;
                private String topSortFactor;

                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
                public static class GuideSaoHuoDataBean implements Serializable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    private String isShow;
                    private String link;
                    private String text;

                    static {
                        t2o.a(664797234);
                    }

                    public String getIsShow() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("84b50cdc", new Object[]{this});
                        }
                        return this.isShow;
                    }

                    public String getLink() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("c509bc89", new Object[]{this});
                        }
                        return this.link;
                    }

                    public String getText() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
                        }
                        return this.text;
                    }

                    public void setIsShow(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("b1967c1a", new Object[]{this, str});
                        } else {
                            this.isShow = str;
                        }
                    }

                    public void setLink(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("70ad150d", new Object[]{this, str});
                        } else {
                            this.link = str;
                        }
                    }

                    public void setText(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
                        } else {
                            this.text = str;
                        }
                    }
                }

                static {
                    t2o.a(664797233);
                }

                public String getFriendType() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (String) ipChange.ipc$dispatch("29a28cb", new Object[]{this});
                    }
                    return this.friendType;
                }

                public GuideSaoHuoDataBean getGuideSaoHuoData() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (GuideSaoHuoDataBean) ipChange.ipc$dispatch("b116af53", new Object[]{this});
                    }
                    return this.guideSaoHuoData;
                }

                public String getPossibleFriendSource() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (String) ipChange.ipc$dispatch("3ef53219", new Object[]{this});
                    }
                    return this.possibleFriendSource;
                }

                public String getTopSortFactor() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (String) ipChange.ipc$dispatch("a3a2ce6d", new Object[]{this});
                    }
                    return this.topSortFactor;
                }

                public void setFriendType(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("c794780b", new Object[]{this, str});
                    } else {
                        this.friendType = str;
                    }
                }

                public void setGuideSaoHuoData(GuideSaoHuoDataBean guideSaoHuoDataBean) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("a19fdd61", new Object[]{this, guideSaoHuoDataBean});
                    } else {
                        this.guideSaoHuoData = guideSaoHuoDataBean;
                    }
                }

                public void setPossibleFriendSource(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("83fab97d", new Object[]{this, str});
                    } else {
                        this.possibleFriendSource = str;
                    }
                }

                public void setTopSortFactor(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("556e111", new Object[]{this, str});
                    } else {
                        this.topSortFactor = str;
                    }
                }
            }

            static {
                t2o.a(664797232);
            }

            public String getBizSubType() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("605761c", new Object[]{this});
                }
                return this.bizSubType;
            }

            public String getCcode() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("3f01981f", new Object[]{this});
                }
                return this.ccode;
            }

            public String getContactType() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("38d12335", new Object[]{this});
                }
                return this.contactType;
            }

            public String getDataType() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("fa55b3bf", new Object[]{this});
                }
                return this.dataType;
            }

            public String getDisplayName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("f9684a22", new Object[]{this});
                }
                return this.displayName;
            }

            public ExtraBean getExtra() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ExtraBean) ipChange.ipc$dispatch("8bc07b1d", new Object[]{this});
                }
                return this.extra;
            }

            public String getGroupId() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this});
                }
                return this.groupId;
            }

            public String getGroupUserNum() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("6e94b87", new Object[]{this});
                }
                return this.groupUserNum;
            }

            public String getHeadIcon() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("41ad7e6a", new Object[]{this});
                }
                return this.headIcon;
            }

            public String getHeadUrl() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4248ad60", new Object[]{this});
                }
                return this.headUrl;
            }

            public String getIsFriend() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("97636bdb", new Object[]{this});
                }
                return this.isFriend;
            }

            public String getIsGuideSaoHuo() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("83e00adc", new Object[]{this});
                }
                return this.isGuideSaoHuo;
            }

            public String getMobilePhone() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("2c8dc403", new Object[]{this});
                }
                return this.mobilePhone;
            }

            public String getNick() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
                }
                return this.nick;
            }

            public String getOldGroupId() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("76182d0", new Object[]{this});
                }
                return this.oldGroupId;
            }

            public String getRecordNum() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("7a26219a", new Object[]{this});
                }
                return this.recordNum;
            }

            public String getShareChannel() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("8731a49f", new Object[]{this});
                }
                return this.shareChannel;
            }

            public String getSourceType() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("c62001ee", new Object[]{this});
                }
                return this.sourceType;
            }

            public String getUpdateTime() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("6422f74d", new Object[]{this});
                }
                return this.updateTime;
            }

            public String getUserId() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
                }
                return this.userId;
            }

            public boolean isFromRecommend() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36e01fb3", new Object[]{this})).booleanValue();
                }
                return TextUtils.equals("2", this.sourceType);
            }

            public void setBizSubType(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3192d4da", new Object[]{this, str});
                } else {
                    this.bizSubType = str;
                }
            }

            public void setCcode(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4e0a019f", new Object[]{this, str});
                } else {
                    this.ccode = str;
                }
            }

            public void setContactType(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f90a7249", new Object[]{this, str});
                } else {
                    this.contactType = str;
                }
            }

            public void setDataType(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("db3e1e97", new Object[]{this, str});
                } else {
                    this.dataType = str;
                }
            }

            public void setDisplayName(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b5828fc", new Object[]{this, str});
                } else {
                    this.displayName = str;
                }
            }

            public void setExtra(ExtraBean extraBean) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6c25de1d", new Object[]{this, extraBean});
                } else {
                    this.extra = extraBean;
                }
            }

            public void setGroupId(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a446e5c9", new Object[]{this, str});
                } else {
                    this.groupId = str;
                }
            }

            public void setGroupUserNum(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("66de99cf", new Object[]{this, str});
                } else {
                    this.groupUserNum = str;
                }
            }

            public void setHeadIcon(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7edfa94c", new Object[]{this, str});
                } else {
                    this.headIcon = str;
                }
            }

            public void setHeadUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd0877e", new Object[]{this, str});
                } else {
                    this.headUrl = str;
                }
            }

            public void setIsFriend(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dfe769fb", new Object[]{this, str});
                } else {
                    this.isFriend = str;
                }
            }

            public void setIsGuideSaoHuo(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2cc13282", new Object[]{this, str});
                } else {
                    this.isGuideSaoHuo = str;
                }
            }

            public void setMobilePhone(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7ce1eb3b", new Object[]{this, str});
                } else {
                    this.mobilePhone = str;
                }
            }

            public void setNick(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a04e97b6", new Object[]{this, str});
                } else {
                    this.nick = str;
                }
            }

            public void setOldGroupId(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bb85ea6", new Object[]{this, str});
                } else {
                    this.oldGroupId = str;
                }
            }

            public void setRecordNum(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4cdbcd84", new Object[]{this, str});
                } else {
                    this.recordNum = str;
                }
            }

            public void setShareChannel(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("efa163b7", new Object[]{this, str});
                } else {
                    this.shareChannel = str;
                }
            }

            public void setSourceType(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("74c9c348", new Object[]{this, str});
                } else {
                    this.sourceType = str;
                }
            }

            public void setUpdateTime(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("972579c9", new Object[]{this, str});
                } else {
                    this.updateTime = str;
                }
            }

            public void setUserId(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
                } else {
                    this.userId = str;
                }
            }
        }

        static {
            t2o.a(664797231);
        }

        public String getAbtestParam() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d92fe695", new Object[]{this});
            }
            return this.abtestParam;
        }

        public List<ContactsBean> getContacts() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("ff466277", new Object[]{this});
            }
            return this.contacts;
        }

        public String getPvid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("813f1942", new Object[]{this});
            }
            return this.pvid;
        }

        public String getRecPicUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("737142da", new Object[]{this});
            }
            return this.recPicUrl;
        }

        public String getScm() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1429a872", new Object[]{this});
            }
            return this.scm;
        }

        public BubbleTipsBean getTips() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BubbleTipsBean) ipChange.ipc$dispatch("48ba9f81", new Object[]{this});
            }
            return this.tips;
        }

        public void setAbtestParam(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64841ae9", new Object[]{this, str});
            } else {
                this.abtestParam = str;
            }
        }

        public void setContacts(List<ContactsBean> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf2965cd", new Object[]{this, list});
            } else {
                this.contacts = list;
            }
        }

        public void setPvid(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b234f74", new Object[]{this, str});
            } else {
                this.pvid = str;
            }
        }

        public void setRecPicUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cf4d444", new Object[]{this, str});
            } else {
                this.recPicUrl = str;
            }
        }

        public void setScm(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f9848ac", new Object[]{this, str});
            } else {
                this.scm = str;
            }
        }

        public void setTips(BubbleTipsBean bubbleTipsBean) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c81e87b", new Object[]{this, bubbleTipsBean});
            } else {
                this.tips = bubbleTipsBean;
            }
        }
    }

    static {
        t2o.a(664797230);
        t2o.a(589299906);
    }

    public DataBean getData() {
        return this.data;
    }

    public String getShareTraceId() {
        return this.shareTraceId;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public void setShareTraceId(String str) {
        this.shareTraceId = str;
    }
}
