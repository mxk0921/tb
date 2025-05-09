package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b1m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public p1m ticket;
    public String url;

    static {
        t2o.a(620757104);
    }

    public b1m(p1m p1mVar) {
        this.ticket = p1mVar;
    }

    public p1m getTicket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1m) ipChange.ipc$dispatch("d0a3ab32", new Object[]{this});
        }
        return this.ticket;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.url;
    }

    public void setTicket(p1m p1mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebeabc4", new Object[]{this, p1mVar});
        } else {
            this.ticket = p1mVar;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public b1m(String str, p1m p1mVar) {
        this.url = str;
        this.ticket = p1mVar;
    }
}
