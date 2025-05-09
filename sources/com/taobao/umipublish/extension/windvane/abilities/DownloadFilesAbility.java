package com.taobao.umipublish.extension.windvane.abilities;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.UmiResourceDownloadBridge;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.itw;
import tb.noh;
import tb.onf;
import tb.rv7;
import tb.t2o;
import tb.tu7;
import tb.upl;
import tb.ydv;
import tb.zu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DownloadFilesAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DownloadFilesAbility";
    private static final String TYPE_PICTURE = "pic";
    private static final String TYPE_VIDEO = "video";
    private final List<DownloadItem> mDownloadList = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class DownloadItem implements Serializable {
        public String md5;
        public boolean needBlockDomain;
        public boolean optional;
        public String path;
        public int progress;
        public int state;
        public String suffix;
        public String tag;
        public String type;
        public String url;
        public float weight;

        static {
            t2o.a(944767151);
        }
    }

    static {
        t2o.a(944767149);
    }

    public static /* synthetic */ void access$000(DownloadFilesAbility downloadFilesAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da28dc71", new Object[]{downloadFilesAbility});
        } else {
            downloadFilesAbility.notifyProgress();
        }
    }

    public static /* synthetic */ void access$100(DownloadFilesAbility downloadFilesAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81c4250", new Object[]{downloadFilesAbility});
        } else {
            downloadFilesAbility.notifyResult();
        }
    }

    private zu7 buildDownloadRequest(DownloadItem downloadItem) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zu7) ipChange.ipc$dispatch("a46329da", new Object[]{this, downloadItem});
        }
        String str2 = downloadItem.url;
        String str3 = downloadItem.md5;
        if (!TextUtils.isEmpty(downloadItem.suffix)) {
            str = downloadItem.suffix;
        } else {
            str = getExtensionName(str2);
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        } else if (!str.startsWith(".")) {
            str = ".".concat(str);
        }
        if ("pic".equals(downloadItem.type) && downloadItem.needBlockDomain) {
            str2 = replaceDomainAndPort(ydv.h(), null, str2);
            downloadItem.url = str2;
        }
        onf onfVar = new onf();
        onfVar.f25507a = str2;
        onfVar.c = str3;
        onfVar.d = noh.a(str2) + str;
        zu7 zu7Var = new zu7();
        zu7Var.b.g = UmiResourceDownloadBridge.getDownloadStoreDir(this.mContext);
        zu7Var.b.f29547a = "guangguang";
        zu7Var.f33016a.add(onfVar);
        return zu7Var;
    }

    private void downloadFiles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19809bd6", new Object[]{this});
            return;
        }
        int size = this.mDownloadList.size();
        for (int i = 0; i < size; i++) {
            final DownloadItem downloadItem = this.mDownloadList.get(i);
            rv7.e().b(buildDownloadRequest(downloadItem), new tu7() { // from class: com.taobao.umipublish.extension.windvane.abilities.DownloadFilesAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.tu7
                public void onDownloadFinish(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                        return;
                    }
                    DownloadItem downloadItem2 = downloadItem;
                    downloadItem2.state = 1;
                    downloadItem2.progress = 100;
                    DownloadFilesAbility.access$000(DownloadFilesAbility.this);
                    if (TextUtils.equals(downloadItem.url, str)) {
                        downloadItem.path = str2;
                    }
                }

                @Override // tb.tu7
                public void onDownloadProgress(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i2)});
                        return;
                    }
                    downloadItem.progress = i2;
                    DownloadFilesAbility.access$000(DownloadFilesAbility.this);
                }

                @Override // tb.tu7
                public void onDownloadStateChange(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                    }
                }

                @Override // tb.tu7
                public void onFinish(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                    } else {
                        DownloadFilesAbility.access$100(DownloadFilesAbility.this);
                    }
                }

                @Override // tb.tu7
                public void onNetworkLimit(int i2, upl uplVar, tu7.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i2), uplVar, aVar});
                    }
                }

                @Override // tb.tu7
                public void onDownloadError(String str, int i2, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i2), str2});
                        return;
                    }
                    downloadItem.state = 1;
                    UmiPublishMonitor.w().o("3001", i2 + "|" + str2, "download_file_error", str);
                }
            });
        }
    }

    public static String getExtensionName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab49fbfb", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (!TextUtils.isEmpty(fileExtensionFromUrl)) {
            return fileExtensionFromUrl;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf <= -1 || lastIndexOf >= str.length() - 1) {
            return "";
        }
        return str.substring(lastIndexOf);
    }

    public static /* synthetic */ Object ipc$super(DownloadFilesAbility downloadFilesAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/DownloadFilesAbility");
    }

    private void notifyProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7038ae1d", new Object[]{this});
        } else if (this.mDownloadList.size() != 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.mDownloadList.size(); i2++) {
                DownloadItem downloadItem = this.mDownloadList.get(i2);
                float f = downloadItem.weight;
                if (f <= 0.0f) {
                    f = 1.0f / this.mDownloadList.size();
                }
                i = (int) (i + (f * downloadItem.progress));
            }
            progressCallback(i);
        }
    }

    private void notifyResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d497a24d", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i = 0; i < this.mDownloadList.size(); i++) {
            DownloadItem downloadItem = this.mDownloadList.get(i);
            if (downloadItem.state != 0) {
                if (TextUtils.isEmpty(downloadItem.path) && !downloadItem.optional) {
                    z = true;
                } else if (!TextUtils.isEmpty(downloadItem.path)) {
                    arrayList.add(downloadItem);
                }
            } else {
                return;
            }
        }
        if (z) {
            errorCallback("3001", "FILE_DOWNLOAD_ERROR");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.add(JSON.toJSON((DownloadItem) it.next()));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fileList", (Object) jSONArray);
        successCallback(jSONObject);
    }

    public static String replaceDomainAndPort(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f695cdb", new Object[]{str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str3) || !str3.contains(itw.URL_SEPARATOR)) {
            return str3;
        }
        String[] split = str3.split(itw.URL_SEPARATOR);
        sb.append(split[0]);
        sb.append(itw.URL_SEPARATOR);
        if (TextUtils.isEmpty(str2)) {
            sb.append(str);
        } else {
            sb.append(str);
            sb.append(":");
            sb.append(str2);
        }
        if (split[1].contains("/")) {
            String[] split2 = split[1].split("/");
            if (split2.length > 1) {
                for (int i = 1; i < split2.length; i++) {
                    sb.append("/");
                    sb.append(split2[i]);
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback("3001", "EMPTY_PARAMS");
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("downloadList");
            if (jSONArray == null || jSONArray.size() == 0) {
                errorCallback("3001", "EMPTY_DATA");
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                this.mDownloadList.add(JSON.toJavaObject(jSONArray.getJSONObject(i), DownloadItem.class));
            }
            downloadFiles();
        }
    }
}
