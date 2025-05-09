package com.taobao.tao.export.flickbtn.mtop;

import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoSharepasswordQueryEntryResponseData implements IMTOPDataObject {
    private Map extendMap;
    private String icon;
    private String shareChannel;
    private String shareIconType;
    private String shareUid;

    static {
        t2o.a(666894407);
        t2o.a(589299906);
    }

    public Map getExtendMap() {
        return this.extendMap;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getShareChannel() {
        return this.shareChannel;
    }

    public String getShareIconType() {
        return this.shareIconType;
    }

    public String getShareUid() {
        return this.shareUid;
    }

    public void setExtendMap(Map map) {
        this.extendMap = map;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setShareChannel(String str) {
        this.shareChannel = str;
    }

    public void setShareIconType(String str) {
        this.shareIconType = str;
    }

    public void setShareUid(String str) {
        this.shareUid = str;
    }
}
