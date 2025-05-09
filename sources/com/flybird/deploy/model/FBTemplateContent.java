package com.flybird.deploy.model;

import android.text.TextUtils;
import com.alibaba.security.realidentity.b;
import com.alipay.birdnest.platform.ConnectionUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.eme;
import tb.fua;
import tb.hr6;
import tb.k8u;
import tb.pgh;
import tb.pt8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBTemplateContent extends FBFullTplInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1299969776034610457L;
    private final CustomInfoMap _do_not_use_local_map = CustomInfoMap.a();
    public Long dataChecksum;
    public String noBundledCheckedPackageVersionName;
    private k8u parsedIdParts;

    private FBTemplateContent() {
    }

    public static void _fromJSONObject(JSONObject jSONObject, FBTemplateContent fBTemplateContent) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4037d330", new Object[]{jSONObject, fBTemplateContent});
            return;
        }
        FBFullTplInfo._fromJSONObject(jSONObject, fBTemplateContent);
        fBTemplateContent.noBundledCheckedPackageVersionName = jSONObject.optString("_checkedPackageVersionName_", null);
    }

    public static FBFullTplInfo asFullTplInfo(FBTemplateContent fBTemplateContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBFullTplInfo) ipChange.ipc$dispatch("a760d082", new Object[]{fBTemplateContent});
        }
        fBTemplateContent.data = null;
        return fBTemplateContent;
    }

    public static FBTemplateContent fromDataObject(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateContent) ipChange.ipc$dispatch("d77d0389", new Object[]{obj});
        }
        return fromJsonString(hr6.f20835a.b(obj, null));
    }

    public static FBTemplateContent fromJSONObject(JSONObject jSONObject) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateContent) ipChange.ipc$dispatch("4670b179", new Object[]{jSONObject});
        }
        FBTemplateContent fBTemplateContent = new FBTemplateContent();
        _fromJSONObject(jSONObject, fBTemplateContent);
        return fBTemplateContent;
    }

    public static FBTemplateContent fromJsonString(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateContent) ipChange.ipc$dispatch("c0d2bf4b", new Object[]{str});
        }
        return fromJSONObject(new JSONObject(str));
    }

    public static /* synthetic */ Object ipc$super(FBTemplateContent fBTemplateContent, String str, Object... objArr) {
        if (str.hashCode() == -143816359) {
            return new Long(super.toChecksum());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/deploy/model/FBTemplateContent");
    }

    public static pt8 toBasicTplInfo(FBTemplateContent fBTemplateContent) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pt8) ipChange.ipc$dispatch("18c49ce3", new Object[]{fBTemplateContent});
        }
        pt8 pt8Var = new pt8();
        pt8Var.b = fBTemplateContent.tplId;
        pt8Var.f26281a = fBTemplateContent.tag;
        pt8Var.f = fBTemplateContent.time;
        pt8Var.d = fBTemplateContent.tplHash;
        pt8Var.c = fBTemplateContent.tplVersion;
        pt8Var.e = fBTemplateContent.publishVersion;
        return pt8Var;
    }

    public void addToLocalMap(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63278a28", new Object[]{this, str, str2});
        } else {
            this._do_not_use_local_map.putPreDefEntry(str, str2);
        }
    }

    public void fillTplTrace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b33b4e9", new Object[]{this, str});
        } else {
            this.tplTrace = str;
        }
    }

    public void generateDataChecksum() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be5eba9", new Object[]{this});
        } else {
            this.dataChecksum = Long.valueOf(fua.b(this.data));
        }
    }

    public Map<String, String> getAllMetaInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8fd2fada", new Object[]{this});
        }
        a();
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    public String[] getMetaInfoAsList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d3a63a39", new Object[]{this, str});
        }
        a();
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject != null) {
            return TextUtils.split(jSONObject.optString(str, ""), ";");
        }
        return null;
    }

    public String getMetaInfoAsStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c66119", new Object[]{this, str});
        }
        a();
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject != null) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public String getNoBundledCheckedPkgVer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd7006c6", new Object[]{this});
        }
        return this.noBundledCheckedPackageVersionName;
    }

    public String getTplName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a334c34", new Object[]{this});
        }
        if (this.parsedIdParts == null) {
            this.parsedIdParts = ConnectionUtils.c(getTplId());
        }
        return this.parsedIdParts.c;
    }

    public boolean hasDataChecksum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27f27ed2", new Object[]{this})).booleanValue();
        }
        if (this.dataChecksum != null) {
            return true;
        }
        return false;
    }

    public String optFromLocalMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b08fa861", new Object[]{this, str});
        }
        return this._do_not_use_local_map.optPreDefEntry(str, "");
    }

    public void setNoBundledCheckedPkgVer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b2770", new Object[]{this, str});
        } else {
            this.noBundledCheckedPackageVersionName = str;
        }
    }

    @Override // com.flybird.deploy.model.FBFullTplInfo, tb.zta
    public long toChecksum() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f76d8959", new Object[]{this})).longValue();
        }
        if (this.dataChecksum == null) {
            return fua.b(String.valueOf(super.toChecksum()), this.noBundledCheckedPackageVersionName);
        }
        return fua.b(String.valueOf(super.toChecksum()), this.noBundledCheckedPackageVersionName, String.valueOf(this.dataChecksum));
    }

    @Override // com.flybird.deploy.model.FBFullTplInfo
    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("FBTemplateContent{noBundledCheckedPackageVersionName='");
        sb.append(this.noBundledCheckedPackageVersionName);
        sb.append("', dataChkSum=");
        sb.append(this.dataChecksum);
        sb.append(", tag='");
        sb.append(this.tag);
        sb.append("', tplId='");
        sb.append(this.tplId);
        sb.append("', tplVersion='");
        sb.append(this.tplVersion);
        sb.append("', publishVersion='");
        sb.append(this.publishVersion);
        sb.append("', time='");
        sb.append(this.time);
        sb.append("', tplHash='");
        sb.append(this.tplHash);
        sb.append("', data='");
        String str2 = "null";
        if (this.data == null) {
            str = str2;
        } else {
            str = this.data.length() + "chars";
        }
        sb.append(str);
        sb.append("', metaInfo='");
        if (this.metaInfo != null) {
            str2 = this.metaInfo.length() + "items";
        }
        sb.append(str2);
        sb.append("', ... }");
        return sb.toString();
    }

    public boolean verifyDataChecksumIfPreset() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("869e92d", new Object[]{this})).booleanValue();
        }
        Long l = this.dataChecksum;
        if (l != null) {
            return fua.d(true, l.longValue(), this.data);
        }
        pgh.i("FBTemplateContent", "verifyDataChecksum: missing checksum");
        return true;
    }

    public final void a() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.metaInfo == null && !this.triedLoadCompatMetaInfoOnUsage) {
            synchronized (this) {
                JSONObject jSONObject2 = null;
                try {
                    String str = this.data;
                    if (str == null) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = ConnectionUtils.d(str);
                        } catch (Throwable th) {
                            pgh.f(b.f2661a, "optJson error", th);
                            jSONObject = new JSONObject();
                        }
                    }
                    JSONArray optJSONArray = jSONObject.optJSONArray("children");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            try {
                                jSONObject2 = optJSONArray.optJSONObject(i);
                            } catch (Throwable th2) {
                                pgh.f(b.f2661a, "error while findJSONObjectFromArray", th2);
                            }
                            if (TextUtils.equals(jSONObject2.optString("tag"), eme.IMAGE_TYPE_HEAD)) {
                                break;
                            }
                        }
                    }
                    if (jSONObject2 != null) {
                        JSONArray optJSONArray2 = jSONObject2.optJSONArray("children");
                        ArrayList arrayList = new ArrayList();
                        if (optJSONArray2 != null) {
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                try {
                                    JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                                    if (TextUtils.equals(optJSONObject.optString("tag"), "meta")) {
                                        arrayList.add(optJSONObject);
                                    }
                                } catch (Throwable th3) {
                                    pgh.f(b.f2661a, "error while findJSONObjectFromArray", th3);
                                }
                            }
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObject4 = (JSONObject) it.next();
                            jSONObject3.put(jSONObject4.optString("name"), jSONObject4.optString("content"));
                        }
                        this.metaInfo = jSONObject3;
                    }
                    this.triedLoadCompatMetaInfoOnUsage = true;
                }
            }
        }
    }
}
