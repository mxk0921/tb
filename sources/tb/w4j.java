package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ResponseSource;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class w4j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Mtop f30449a;
    public MtopRequest b;
    public MtopResponse c;
    public MtopNetworkProp d = new MtopNetworkProp();
    public MtopListener e;
    public ApiID f;
    public MtopStatistics g;
    public String h;
    public Map<String, String> i;
    public ResponseSource j;
    public h3o k;
    public String l;
    public Map<String, String> m;
    public o9o n;
    public MtopBuilder o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Class<?> v;

    static {
        t2o.a(589299811);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2d61493", new Object[]{this});
        }
        if (this.k == null) {
            return "";
        }
        return ", headerFields=" + this.k.c;
    }
}
