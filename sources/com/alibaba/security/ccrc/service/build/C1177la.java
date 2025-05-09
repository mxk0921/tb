package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.la  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1177la {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<TrackLog> f2605a = new CopyOnWriteArrayList();
    public C1153da b;
    public boolean c;

    private synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.c) {
            if (e()) {
                List<TrackLog> b = this.b.b();
                if (b != null && !b.isEmpty()) {
                    this.f2605a.addAll(b);
                }
                this.c = true;
            }
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.b == null) {
            this.b = new C1153da(context);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.f2605a.isEmpty()) {
            return false;
        }
        for (TrackLog trackLog : c()) {
            if (trackLog != null && "detect".equals(trackLog.phase)) {
                return true;
            }
        }
        return false;
    }

    public List<TrackLog> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        d();
        return this.f2605a;
    }

    public void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4926222", new Object[]{this, trackLog});
        } else if (e()) {
            d();
            this.f2605a.add(trackLog);
            this.b.a(trackLog);
        }
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : this.f2605a.size() >= i;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (e()) {
            this.f2605a.clear();
            this.b.a();
        }
    }
}
