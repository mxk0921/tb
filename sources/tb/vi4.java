package tb;

import android.os.RemoteException;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anetwork.channel.aidl.Connection;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.net.HttpURLConnection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vi4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Connection f30028a;
    public final HttpURLConnection b;

    static {
        t2o.a(774897873);
    }

    public vi4(Connection connection) {
        this.f30028a = connection;
    }

    public void a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9dd2f23", new Object[]{this});
            return;
        }
        Connection connection = this.f30028a;
        if (connection != null) {
            connection.cancel();
        }
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0a48918", new Object[]{this, str});
        }
        try {
            Connection connection = this.f30028a;
            if (connection != null) {
                return HttpHelper.getSingleHeaderFieldByKey(connection.getConnHeadFields(), str);
            }
            HttpURLConnection httpURLConnection = this.b;
            if (httpURLConnection != null) {
                return httpURLConnection.getHeaderField(str);
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbf7104d", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(b(str));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public yaf d() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yaf) ipChange.ipc$dispatch("804c431c", new Object[]{this});
        }
        if (this.f30028a != null) {
            return new yaf(this.f30028a.getInputStream());
        }
        if (this.b != null) {
            return new yaf(this.b.getInputStream());
        }
        return null;
    }

    public int e() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("baa782be", new Object[]{this})).intValue();
        }
        Connection connection = this.f30028a;
        if (connection != null) {
            return connection.getStatusCode();
        }
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection != null) {
            return httpURLConnection.getResponseCode();
        }
        return 0;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60134415", new Object[]{this});
        }
        try {
            Connection connection = this.f30028a;
            if (connection != null && connection.getStatisticData() != null) {
                return this.f30028a.getStatisticData().sumNetStat() + ",netType=TBNet,xCache=" + b(HttpConstant.X_CACHE);
            } else if (this.b == null) {
                return "";
            } else {
                StringBuilder sb = new StringBuilder(128);
                sb.append(",host=");
                sb.append(this.b.getRequestProperty(HttpConstant.HOST));
                sb.append(",resultCode=");
                sb.append(this.b.getResponseCode());
                sb.append(",connType=");
                sb.append(this.b.getHeaderField("X-Android-Selected-Protocol"));
                sb.append(",recDataTime=");
                sb.append(Long.valueOf(this.b.getHeaderField("X-Android-Received-Millis")).longValue() - Long.valueOf(this.b.getHeaderField("X-Android-Sent-Millis")).longValue());
                sb.append(",totalSize=");
                sb.append(this.b.getContentLength());
                sb.append(",netType=SYSNet,xCache=");
                sb.append(this.b.getHeaderField(HttpConstant.X_CACHE));
                return sb.toString();
            }
        } catch (RemoteException e) {
            AVSDKLog.e("TBNetStatistic", "getStatisticData error:" + e.getMessage());
            return "";
        } catch (Exception e2) {
            AVSDKLog.e("TBNetStatistic", "getStatisticData error:" + e2.getMessage());
            return "";
        }
    }

    public vi4(HttpURLConnection httpURLConnection) {
        this.b = httpURLConnection;
    }
}
