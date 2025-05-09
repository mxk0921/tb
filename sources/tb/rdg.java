package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.LSDB;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rdg extends LSDB {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f27295a;

    public static /* synthetic */ Object ipc$super(rdg rdgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/protodb/LSDBDefaultImpl");
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e32ba683", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean contains(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ea7e296", new Object[]{this, k3gVar})).booleanValue();
        }
        return this.f27295a.contains(k3gVar.a());
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean delete(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad8d1c22", new Object[]{this, k3gVar})).booleanValue();
        }
        this.f27295a.edit().remove(k3gVar.a()).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean forceCompact(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75df98a8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.protodb.LSDB
    public byte[] getBinary(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("67dbdeb3", new Object[]{this, k3gVar});
        }
        return null;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean getBool(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61c24357", new Object[]{this, k3gVar})).booleanValue();
        }
        return this.f27295a.getBoolean(k3gVar.a(), false);
    }

    @Override // com.taobao.android.protodb.LSDB
    public int getDataSize(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1261fa7", new Object[]{this, k3gVar})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.android.protodb.LSDB
    public double getDouble(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e937d728", new Object[]{this, k3gVar})).doubleValue();
        }
        return getFloat(k3gVar);
    }

    @Override // com.taobao.android.protodb.LSDB
    public float getFloat(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c427bd89", new Object[]{this, k3gVar})).floatValue();
        }
        return this.f27295a.getFloat(k3gVar.a(), 0.0f);
    }

    @Override // com.taobao.android.protodb.LSDB
    public int getInt(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f76f01f", new Object[]{this, k3gVar})).intValue();
        }
        return this.f27295a.getInt(k3gVar.a(), 0);
    }

    @Override // com.taobao.android.protodb.LSDB
    public long getLong(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("553edd9", new Object[]{this, k3gVar})).longValue();
        }
        return this.f27295a.getLong(k3gVar.a(), 0L);
    }

    @Override // com.taobao.android.protodb.LSDB
    public String getString(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcc07c66", new Object[]{this, k3gVar});
        }
        return this.f27295a.getString(k3gVar.a(), "");
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertBinary(k3g k3gVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5903c98", new Object[]{this, k3gVar, bArr})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertBool(k3g k3gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bb091e2", new Object[]{this, k3gVar, new Boolean(z)})).booleanValue();
        }
        this.f27295a.edit().putBoolean(k3gVar.a(), z).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertDouble(k3g k3gVar, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5f1d05", new Object[]{this, k3gVar, new Double(d)})).booleanValue();
        }
        this.f27295a.edit().putFloat(k3gVar.a(), (float) d).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertFloat(k3g k3gVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0dda4ee", new Object[]{this, k3gVar, new Float(f)})).booleanValue();
        }
        this.f27295a.edit().putFloat(k3gVar.a(), f).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertInt(k3g k3gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38585cbe", new Object[]{this, k3gVar, new Integer(i)})).booleanValue();
        }
        this.f27295a.edit().putInt(k3gVar.a(), i).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertLong(k3g k3gVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a53fd80", new Object[]{this, k3gVar, new Long(j)})).booleanValue();
        }
        this.f27295a.edit().putLong(k3gVar.a(), j).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public boolean insertString(k3g k3gVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b755fab", new Object[]{this, k3gVar, str})).booleanValue();
        }
        this.f27295a.edit().putString(k3gVar.a(), str).apply();
        return true;
    }

    @Override // com.taobao.android.protodb.LSDB
    public jpf<k3g> keyIterator(k3g k3gVar, k3g k3gVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpf) ipChange.ipc$dispatch("833a0053", new Object[]{this, k3gVar, k3gVar2});
        }
        return null;
    }

    @Override // com.taobao.android.protodb.LSDB
    public jpf<k3g> keyIterator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jpf) ipChange.ipc$dispatch("79e68d7b", new Object[]{this}) : new v3g((String[]) this.f27295a.getAll().keySet().toArray(new String[0]));
    }

    public rdg(Context context) {
        super(0L, "", 0);
        this.f27295a = context.getSharedPreferences("lsdb", 0);
    }
}
