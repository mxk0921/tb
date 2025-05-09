package tb;

import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class g8b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f19785a;

        static {
            t2o.a(481297601);
        }

        public a(String str, String str2) {
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa7d5059", new Object[]{this});
            } else {
                c();
            }
        }

        public byte[] b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("e6eec916", new Object[]{this});
            }
            return this.f19785a;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56904517", new Object[]{this})).booleanValue();
            }
            byte[] bArr = this.f19785a;
            if (bArr == null || bArr.length <= 0) {
                return false;
            }
            return true;
        }

        public a(byte[] bArr, String str) {
            this.f19785a = bArr;
            a();
        }
    }

    static {
        t2o.a(481297600);
    }

    public static a a(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ca8b9235", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return new a("url_empty", "url empty");
        }
        try {
            Response syncSend = new DegradableNetwork(caa.c()).syncSend(new RequestImpl(str), null);
            int statusCode = syncSend.getStatusCode();
            if (statusCode != 200) {
                return new a(String.valueOf(statusCode), syncSend.getDesc());
            }
            Map<String, List<String>> connHeadFields = syncSend.getConnHeadFields();
            String str2 = "UTF-8";
            if (!(connHeadFields == null || (list = connHeadFields.get("Content-Type")) == null || list.size() <= 0)) {
                String str3 = list.get(0);
                if (str3.contains("charset=")) {
                    str2 = str3.substring(str3.indexOf("charset=") + 8).trim();
                }
            }
            return new a(syncSend.getBytedata(), str2);
        } catch (Exception e) {
            agh.c("HttpUtil", "fail to request with the url" + str);
            return new a(e.getClass().getSimpleName(), e.getMessage());
        }
    }
}
