package com.taobao.adaemon;

import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.exception.IPCException;
import tb.s55;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f6146a;
    public boolean b;
    public IRemoteProcessHandler c;

    static {
        t2o.a(349175856);
    }

    public d(String str) {
        this.f6146a = str;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26833df7", new Object[]{this})).booleanValue();
        }
        IRemoteProcessHandler iRemoteProcessHandler = this.c;
        if (iRemoteProcessHandler == null) {
            return false;
        }
        try {
            return iRemoteProcessHandler.clearActivityStack();
        } catch (IPCException e) {
            s55.h("Process", "[clearActivityStack]error.", null, e);
            return false;
        }
    }

    public Pair<Long, Long> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("abbb91c1", new Object[]{this});
        }
        IRemoteProcessHandler iRemoteProcessHandler = this.c;
        if (iRemoteProcessHandler == null) {
            return null;
        }
        try {
            String mainProcCpuCost = iRemoteProcessHandler.getMainProcCpuCost();
            if (TextUtils.isEmpty(mainProcCpuCost)) {
                return null;
            }
            String[] split = mainProcCpuCost.split(",");
            return Pair.create(Long.valueOf(Long.parseLong(split[0])), Long.valueOf(Long.parseLong(split[1])));
        } catch (Throwable unused) {
            return null;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f6146a;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbaf1a83", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27d30792", new Object[]{this})).booleanValue();
        }
        IRemoteProcessHandler iRemoteProcessHandler = this.c;
        if (iRemoteProcessHandler == null) {
            return false;
        }
        try {
            return iRemoteProcessHandler.isBgFromHomePage();
        } catch (IPCException unused) {
            return false;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("252586c1", new Object[]{this})).booleanValue();
        }
        IRemoteProcessHandler iRemoteProcessHandler = this.c;
        if (iRemoteProcessHandler == null) {
            return false;
        }
        try {
            return iRemoteProcessHandler.isProcessLive();
        } catch (IPCException unused) {
            return false;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d6b9d0", new Object[]{this})).booleanValue();
        }
        IRemoteProcessHandler iRemoteProcessHandler = this.c;
        if (iRemoteProcessHandler == null) {
            return false;
        }
        try {
            return iRemoteProcessHandler.isTinyProcess();
        } catch (IPCException unused) {
            return false;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a7e1fd", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void i(IRemoteProcessHandler iRemoteProcessHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c40f131", new Object[]{this, iRemoteProcessHandler});
        } else {
            this.c = iRemoteProcessHandler;
        }
    }

    public void j(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33430def", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        IRemoteProcessHandler iRemoteProcessHandler = this.c;
        if (iRemoteProcessHandler != null) {
            try {
                iRemoteProcessHandler.tryDumpMainProc(j, j2);
            } catch (IPCException e) {
                s55.h("Process", "tryDumpMainProc ipc", e, new Object[0]);
            }
        }
    }
}
