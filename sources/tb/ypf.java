package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ypf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(921698338);
    }

    public String getIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
        }
        return null;
    }

    public ksf onCallConstructor(jb1 jb1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("da205c38", new Object[]{this, jb1Var});
        }
        return null;
    }

    public ksf onCallFunction(jb1 jb1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
        }
        return null;
    }

    public boolean onDeleteIndexedProperty(dqf dqfVar, ksf ksfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7296e438", new Object[]{this, dqfVar, ksfVar, new Integer(i)})).booleanValue();
        }
        ksfVar.delete();
        return true;
    }

    public boolean onDeleteNamedProperty(dqf dqfVar, ksf ksfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbe0bf5", new Object[]{this, dqfVar, ksfVar, str})).booleanValue();
        }
        ksfVar.delete();
        return true;
    }

    public void onDetached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa39278", new Object[]{this});
        }
    }

    public ksf[] onEnumerateIndexedProperty(dqf dqfVar, ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf[]) ipChange.ipc$dispatch("f1842874", new Object[]{this, dqfVar, ksfVar});
        }
        ksfVar.delete();
        return null;
    }

    public ksf[] onEnumerateNamedProperty(dqf dqfVar, ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf[]) ipChange.ipc$dispatch("395f9f7c", new Object[]{this, dqfVar, ksfVar});
        }
        ksfVar.delete();
        return null;
    }

    public ksf onGetIndexedProperty(dqf dqfVar, ksf ksfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("2cc63a14", new Object[]{this, dqfVar, ksfVar, new Integer(i)});
        }
        ksfVar.delete();
        return null;
    }

    public ksf onGetNamedProperty(dqf dqfVar, ksf ksfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("265cf4cb", new Object[]{this, dqfVar, ksfVar, str});
        }
        ksfVar.delete();
        return null;
    }

    public ksf onGetProperty(dqf dqfVar, ksf ksfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("21e73136", new Object[]{this, dqfVar, ksfVar, str});
        }
        ksfVar.delete();
        return null;
    }

    public int onQueryIndexedProperty(dqf dqfVar, ksf ksfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a20176c8", new Object[]{this, dqfVar, ksfVar, new Integer(i)})).intValue();
        }
        ksfVar.delete();
        return 0;
    }

    public int onQueryNamedProperty(dqf dqfVar, ksf ksfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e959c323", new Object[]{this, dqfVar, ksfVar, str})).intValue();
        }
        ksfVar.delete();
        return 0;
    }

    public ksf onSetIndexedProperty(dqf dqfVar, ksf ksfVar, int i, ksf ksfVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("55590f4f", new Object[]{this, dqfVar, ksfVar, new Integer(i), ksfVar2});
        }
        ksfVar.delete();
        ksfVar2.delete();
        return null;
    }

    public ksf onSetNamedProperty(dqf dqfVar, ksf ksfVar, String str, ksf ksfVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("5a17e960", new Object[]{this, dqfVar, ksfVar, str, ksfVar2});
        }
        ksfVar.delete();
        ksfVar2.delete();
        return null;
    }

    public void onSetProperty(dqf dqfVar, ksf ksfVar, String str, ksf ksfVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99730ba0", new Object[]{this, dqfVar, ksfVar, str, ksfVar2});
            return;
        }
        ksfVar.delete();
        ksfVar2.delete();
    }
}
