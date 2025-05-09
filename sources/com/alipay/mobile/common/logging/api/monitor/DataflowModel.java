package com.alipay.mobile.common.logging.api.monitor;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DataflowModel implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3953a;
    public String appId;
    public int b = 2;
    public String bizId;
    public String bundle;
    public String diagnose;
    public Map<String, String> extParams;
    public String fileId;
    @Deprecated
    public String host;
    public boolean isUpload;
    public Map<String, String> params;
    public Header[] reqHeaders;
    public long reqSize;
    public Header[] respHeaders;
    public long respSize;
    public DataflowID type;
    public String url;

    @Deprecated
    public static DataflowModel obtain(String str, long j, long j2, DataflowID dataflowID, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataflowModel) ipChange.ipc$dispatch("79ffaa38", new Object[]{str, new Long(j), new Long(j2), dataflowID, str2, str3}) : obtain(dataflowID, str, j, j2, str3);
    }

    public DataflowModel cloneMirror() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataflowModel) ipChange.ipc$dispatch("5f50e459", new Object[]{this});
        }
        DataflowModel obtain = obtain(this.type, this.url, this.reqSize, this.respSize, this.diagnose);
        obtain.bundle = this.bundle;
        obtain.appId = this.appId;
        obtain.isUpload = this.isUpload;
        obtain.fileId = this.fileId;
        obtain.bizId = this.bizId;
        obtain.reqHeaders = this.reqHeaders;
        obtain.respHeaders = this.respHeaders;
        obtain.extParams = this.extParams;
        obtain.host = this.host;
        obtain.f3953a = this.f3953a;
        if (this.params != null) {
            obtain.params = new HashMap();
            for (Map.Entry<String, String> entry : this.params.entrySet()) {
                obtain.params.put(entry.getKey(), entry.getValue());
            }
        }
        return obtain;
    }

    public int getLoggerLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66e4fc18", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String getParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf0db78", new Object[]{this, str});
        }
        Map<String, String> map = this.params;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public boolean isInUse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1363d7a3", new Object[]{this})).booleanValue();
        }
        return this.f3953a;
    }

    public DataflowModel putParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataflowModel) ipChange.ipc$dispatch("f03315c3", new Object[]{this, str, str2});
        }
        if (this.params == null) {
            this.params = new HashMap();
        }
        this.params.put(str, str2);
        return this;
    }

    public void recycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
            return;
        }
        this.f3953a = false;
        this.type = DataflowID.UNKNOWN;
        this.url = null;
        this.reqSize = 0L;
        this.respSize = 0L;
        this.bundle = null;
        this.appId = null;
        this.diagnose = null;
        this.isUpload = false;
        this.fileId = null;
        this.bizId = null;
        this.reqHeaders = null;
        this.respHeaders = null;
        this.params = null;
        this.extParams = null;
        this.host = null;
    }

    public DataflowModel removeParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataflowModel) ipChange.ipc$dispatch("ddebfc2", new Object[]{this, str});
        }
        Map<String, String> map = this.params;
        if (map != null) {
            map.remove(str);
        }
        return this;
    }

    public void report() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
        } else {
            LoggerFactory.getMonitorLogger().dataflow(this);
        }
    }

    public void setLoggerLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b7908a", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public static DataflowModel obtain(DataflowID dataflowID, String str, long j, long j2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataflowModel) ipChange.ipc$dispatch("9a4736ee", new Object[]{dataflowID, str, new Long(j), new Long(j2), str2});
        }
        DataflowModel dataflowModel = new DataflowModel();
        dataflowModel.recycle();
        dataflowModel.type = dataflowID;
        dataflowModel.url = str;
        dataflowModel.reqSize = j;
        dataflowModel.respSize = j2;
        dataflowModel.diagnose = str2;
        dataflowModel.f3953a = true;
        return dataflowModel;
    }
}
