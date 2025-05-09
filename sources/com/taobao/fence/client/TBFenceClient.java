package com.taobao.fence.client;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.fence.aidl.ITBFenceService;
import com.taobao.fence.common.FenceDataDTO;
import com.taobao.fence.common.ResultEnums;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBFenceClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static WeakReference<TBFenceClient> d;

    /* renamed from: a  reason: collision with root package name */
    public ITBFenceService f10562a;
    public final WeakReference<Context> b;
    public int c = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum TypeEnum {
        GEOMETRY(1),
        WIFI(2),
        IBEACON(4);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int type;

        TypeEnum(int i) {
            this.type = i;
        }

        public static /* synthetic */ Object ipc$super(TypeEnum typeEnum, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/fence/client/TBFenceClient$TypeEnum");
        }

        public static TypeEnum valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TypeEnum) ipChange.ipc$dispatch("f44c7b88", new Object[]{str});
            }
            return (TypeEnum) Enum.valueOf(TypeEnum.class, str);
        }

        public int getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return this.type;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public final class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(756023302);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/fence/client/TBFenceClient$GetServiceTask");
        }

        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            try {
                TBFenceClient tBFenceClient = TBFenceClient.this;
                TBFenceClient.access$002(tBFenceClient, (ITBFenceService) Services.get((Context) TBFenceClient.access$100(tBFenceClient).get(), ITBFenceService.class));
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        t2o.a(756023300);
    }

    public TBFenceClient(Context context) {
        this.b = new WeakReference<>(context);
        new b().execute(new Void[0]);
    }

    public static int a(Set<TypeEnum> set) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89db259b", new Object[]{set})).intValue();
        }
        if (set != null) {
            for (TypeEnum typeEnum : set) {
                i += typeEnum.getType();
            }
        }
        return i;
    }

    public static /* synthetic */ ITBFenceService access$002(TBFenceClient tBFenceClient, ITBFenceService iTBFenceService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITBFenceService) ipChange.ipc$dispatch("d80b780b", new Object[]{tBFenceClient, iTBFenceService});
        }
        tBFenceClient.f10562a = iTBFenceService;
        return iTBFenceService;
    }

    public static /* synthetic */ WeakReference access$100(TBFenceClient tBFenceClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("4b7b30dc", new Object[]{tBFenceClient});
        }
        return tBFenceClient.b;
    }

    public static TBFenceClient getFenceClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFenceClient) ipChange.ipc$dispatch("49d798a3", new Object[0]);
        }
        WeakReference<TBFenceClient> weakReference = d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static TBFenceClient newInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFenceClient) ipChange.ipc$dispatch("fc3e58a2", new Object[]{context});
        }
        TBFenceClient tBFenceClient = new TBFenceClient(context);
        WeakReference<TBFenceClient> weakReference = d;
        if (weakReference != null) {
            weakReference.clear();
            d = null;
        }
        d = new WeakReference<>(tBFenceClient);
        return tBFenceClient;
    }

    public void gatherData(List<String> list, TypeEnum... typeEnumArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4335eb83", new Object[]{this, list, typeEnumArr});
        } else if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId() && typeEnumArr != null && typeEnumArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (TypeEnum typeEnum : typeEnumArr) {
                hashSet.add(typeEnum);
            }
            int a2 = a(hashSet);
            if (this.f10562a == null && this.b.get() != null) {
                this.f10562a = (ITBFenceService) Services.get(this.b.get(), ITBFenceService.class);
            }
            if (this.f10562a != null) {
                try {
                    this.f10562a.gatherData(a2, JSON.toJSONString(list));
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public FenceDataDTO getData(long j, List<String> list, TypeEnum... typeEnumArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FenceDataDTO) ipChange.ipc$dispatch("b39876bc", new Object[]{this, new Long(j), list, typeEnumArr});
        }
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            return new FenceDataDTO(false, ResultEnums.MAIN_THREAD_FAIL);
        }
        if (typeEnumArr == null || typeEnumArr.length == 0) {
            return new FenceDataDTO(false, ResultEnums.PARAMETER_FAIL);
        }
        HashSet hashSet = new HashSet();
        for (TypeEnum typeEnum : typeEnumArr) {
            hashSet.add(typeEnum);
        }
        int a2 = a(hashSet);
        if (this.f10562a == null && this.b.get() != null) {
            this.f10562a = (ITBFenceService) Services.get(this.b.get(), ITBFenceService.class);
        }
        if (this.f10562a == null) {
            return new FenceDataDTO(false, ResultEnums.SYS_FAIL);
        }
        try {
            return this.f10562a.getData(a2, j, JSON.toJSONString(list));
        } catch (RemoteException unused) {
            Log.e("TBFenceClient", "getData method fail!");
            return new FenceDataDTO(false, ResultEnums.REMOTE_ERROR);
        }
    }

    public int getScanTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("376298da", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public void setScanTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c75d70", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
