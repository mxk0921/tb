package com.alibaba.ability.impl.sessionkvstorage;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility;
import com.taobao.android.abilityidl.ability.SessionKVStorageCurrentInfo;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.a07;
import tb.ckf;
import tb.hfn;
import tb.kdb;
import tb.kqu;
import tb.lep;
import tb.mep;
import tb.t2o;
import tb.tao;
import tb.uj3;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SessionKVStorageAbility extends AbsSessionKVStorageAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f2027a = new ReentrantReadWriteLock();
    public final LinkedHashMap<String, String> b = new LinkedHashMap<>();
    public int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(131072003);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(131072002);
    }

    public static /* synthetic */ Object ipc$super(SessionKVStorageAbility sessionKVStorageAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/sessionkvstorage/SessionKVStorageAbility");
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility
    public tao<Object, ErrorResult> clear(kdb kdbVar) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("ee4b0aef", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "context");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f2027a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.b.clear();
            this.c = 0;
            xhv xhvVar = xhv.INSTANCE;
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            return new tao<>(null, null, 3, null);
        } catch (Throwable th) {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility
    public tao<SessionKVStorageCurrentInfo, ErrorResult> getCurrentInfo(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("c404182b", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "context");
        SessionKVStorageCurrentInfo sessionKVStorageCurrentInfo = new SessionKVStorageCurrentInfo();
        ReentrantReadWriteLock.ReadLock readLock = this.f2027a.readLock();
        readLock.lock();
        try {
            sessionKVStorageCurrentInfo.totalSize = 5242880;
            sessionKVStorageCurrentInfo.freeSize = hfn.c(5242880 - this.c, 0);
            xhv xhvVar = xhv.INSTANCE;
            readLock.unlock();
            return new tao<>(sessionKVStorageCurrentInfo, null, 2, null);
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility
    public tao<String, ErrorResult> getItem(kdb kdbVar, lep lepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("1b94c4db", new Object[]{this, kdbVar, lepVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(lepVar, "params");
        ReentrantReadWriteLock.ReadLock readLock = this.f2027a.readLock();
        readLock.lock();
        try {
            String str = this.b.get(lepVar.f23299a);
            if (str == null) {
                str = "";
            }
            readLock.unlock();
            return new tao<>(str, null, 2, null);
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility
    public tao<List<String>, ErrorResult> getAllKeys(kdb kdbVar) {
        List list;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("b395f7fd", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "context");
        try {
            list = kqu.c(new JSONArray());
        } catch (Throwable unused) {
            list = new ArrayList();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f2027a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Set<String> keySet = this.b.keySet();
            ckf.f(keySet, "storageMap.keys");
            for (String str : keySet) {
                ckf.f(str, AdvanceSetting.NETWORK_TYPE);
                list.add(str);
            }
            xhv xhvVar = xhv.INSTANCE;
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            return new tao<>(list, null, 2, null);
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility
    public tao<Object, ErrorResult> removeItem(kdb kdbVar, lep lepVar) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("db7aeb09", new Object[]{this, kdbVar, lepVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(lepVar, "params");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f2027a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            String remove = this.b.remove(lepVar.f23299a);
            if (remove != null) {
                byte[] bytes = remove.getBytes(uj3.UTF_8);
                ckf.f(bytes, "(this as java.lang.String).getBytes(charset)");
                i = bytes.length;
            } else {
                i = 0;
            }
            int i4 = this.c - i;
            this.c = i4;
            if (i4 < 0) {
                this.c = 0;
            }
            xhv xhvVar = xhv.INSTANCE;
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            return new tao<>(null, null, 3, null);
        } catch (Throwable th) {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility
    public tao<Object, ErrorResult> setItem(kdb kdbVar, mep mepVar) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("705d614", new Object[]{this, kdbVar, mepVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(mepVar, "params");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f2027a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (this.c > 5242880) {
                return new tao<>(null, new ErrorResult("NO_SPACE", "配额不足，请删除无效数据", (Map) null, 4, (a07) null));
            }
            String str = mepVar.b;
            ckf.f(str, "params.value");
            Charset charset = uj3.UTF_8;
            byte[] bytes = str.getBytes(charset);
            ckf.f(bytes, "(this as java.lang.String).getBytes(charset)");
            int length = bytes.length;
            String str2 = this.b.get(mepVar.f23995a);
            if (str2 != null) {
                byte[] bytes2 = str2.getBytes(charset);
                ckf.f(bytes2, "(this as java.lang.String).getBytes(charset)");
                i = bytes2.length;
            } else {
                i = 0;
            }
            this.c = (this.c - i) + length;
            LinkedHashMap<String, String> linkedHashMap = this.b;
            String str3 = mepVar.f23995a;
            ckf.f(str3, "params.key");
            linkedHashMap.put(str3, mepVar.b);
            xhv xhvVar = xhv.INSTANCE;
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            return new tao<>(null, null, 3, null);
        } finally {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }
}
