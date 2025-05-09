package com.taobao.taolive.sdk.controller;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.controller2.OpenLiveSingleRoomVH;
import com.taobao.taolive.room.controller2.state.State;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.cba;
import tb.cwd;
import tb.d4s;
import tb.jng;
import tb.naj;
import tb.qvs;
import tb.t2o;
import tb.v2s;
import tb.x5t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BaseListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f13272a;
    public ArrayList<IRecyclerModel> b;
    public final Context c;
    public cba d;
    public RecyclerView.ViewHolder e;
    public String f;
    public naj h;
    public final SparseArray<a> g = new SparseArray<>();
    public final jng i = new jng();
    public final Map<Integer, RecyclerView.ViewHolder> J = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Class<? extends RecyclerView.ViewHolder> f13273a;
        public int b;

        static {
            t2o.a(779093420);
        }
    }

    static {
        t2o.a(779093419);
    }

    public BaseListAdapter(Context context) {
        this.c = context;
    }

    public static /* synthetic */ Object ipc$super(BaseListAdapter baseListAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1156665041) {
            super.onDetachedFromRecyclerView((RecyclerView) objArr[0]);
            return null;
        } else if (hashCode == 2130396206) {
            super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/sdk/controller/BaseListAdapter");
        }
    }

    public void M(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e98e302", new Object[]{this, new Integer(i), aVar});
        } else {
            this.g.put(i, aVar);
        }
    }

    public final String N(Exception exc) {
        Throwable th;
        PrintWriter printWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc1ce214", new Object[]{this, exc});
        }
        StringWriter stringWriter = null;
        try {
            StringWriter stringWriter2 = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter2);
                try {
                    exc.printStackTrace(printWriter);
                    printWriter.flush();
                    stringWriter2.flush();
                    try {
                        stringWriter2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    printWriter.close();
                    return stringWriter2.toString();
                } catch (Throwable th2) {
                    th = th2;
                    stringWriter = stringWriter2;
                    if (stringWriter != null) {
                        try {
                            stringWriter.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                printWriter = null;
            }
        } catch (Throwable th4) {
            th = th4;
            printWriter = null;
        }
    }

    public void O(RecyclerView.ViewHolder viewHolder) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abba919b", new Object[]{this, viewHolder});
        } else if ((viewHolder instanceof OpenLiveSingleRoomVH) && (str = this.f) != null) {
            View view = viewHolder.itemView;
            int i = R.id.tblive_tag_key_model;
            if (str.equals(((IRecyclerModel) view.getTag(i)).getViewItemId()) && ((OpenLiveSingleRoomVH) this.e).isAboutToEndState()) {
                RecyclerView.ViewHolder viewHolder2 = this.e;
                if (viewHolder2 instanceof OpenLiveSingleRoomVH) {
                    ((OpenLiveSingleRoomVH) viewHolder2).interruptEndingState();
                }
            } else if (!this.f.equals(((IRecyclerModel) viewHolder.itemView.getTag(i)).getViewItemId()) && !((OpenLiveSingleRoomVH) this.e).isAboutToEndState()) {
                RecyclerView.ViewHolder viewHolder3 = this.e;
                if (viewHolder3 instanceof OpenLiveSingleRoomVH) {
                    ((OpenLiveSingleRoomVH) viewHolder3).aboutToDisappear();
                }
            }
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.e;
        if (viewHolder instanceof IComponentLifeCycle2) {
            ((IComponentLifeCycle2) viewHolder).onPause();
        }
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.e;
        if (viewHolder instanceof IComponentLifeCycle2) {
            ((IComponentLifeCycle2) viewHolder).onResume();
        }
    }

    public void S(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.e;
        if (viewHolder instanceof IComponentLifeCycle2) {
            ((IComponentLifeCycle2) viewHolder).onScrollStateChanged(i);
        }
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.e;
        if (viewHolder instanceof IComponentLifeCycle2) {
            ((IComponentLifeCycle2) viewHolder).onStart();
        }
    }

    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.e;
        if (viewHolder instanceof TaoLiveRoomBaseVH) {
            ((TaoLiveRoomBaseVH) viewHolder).onStop(z);
        }
    }

    public void V(RecyclerView.ViewHolder viewHolder, IRecyclerModel iRecyclerModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64a21b6", new Object[]{this, viewHolder, iRecyclerModel, new Integer(i)});
        }
    }

    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8d8382", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void X(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c924ce", new Object[]{this, cbaVar});
        } else {
            this.d = cbaVar;
        }
    }

    public void Y(naj najVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e03fcb7", new Object[]{this, najVar});
        } else {
            this.h = najVar;
        }
    }

    public void Z(ArrayList<IRecyclerModel> arrayList) {
        ArrayList<IRecyclerModel> arrayList2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4e789d", new Object[]{this, arrayList});
            return;
        }
        if (arrayList != null) {
            arrayList2 = (ArrayList) arrayList.clone();
        } else {
            arrayList2 = null;
        }
        this.b = arrayList2;
    }

    public void a0(RecyclerView.ViewHolder viewHolder, State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b69ac9c", new Object[]{this, viewHolder, state});
        }
    }

    public void b0(RecyclerView.ViewHolder viewHolder, State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8048ea", new Object[]{this, viewHolder, state});
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        ArrayList<IRecyclerModel> arrayList = this.b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        ArrayList<IRecyclerModel> arrayList = this.b;
        if (arrayList != null) {
            return arrayList.get(i).getViewType();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efb442e", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f13272a = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        IRecyclerModel iRecyclerModel = this.b.get(i);
        V(viewHolder, iRecyclerModel, i);
        if (viewHolder instanceof IComponentLifeCycle2) {
            if (qvs.u()) {
                ((IComponentLifeCycle2) viewHolder).onViewHolderWillLoad(iRecyclerModel);
            } else {
                ((IComponentLifeCycle2) viewHolder).onPreloadView(iRecyclerModel);
            }
        }
        viewHolder.itemView.setTag(R.id.tblive_tag_key_holder, viewHolder);
        viewHolder.itemView.setTag(R.id.tblive_tag_key_model, iRecyclerModel);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        a aVar = this.g.get(i);
        if (aVar != null) {
            try {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) aVar.f13273a.getDeclaredConstructor(View.class).newInstance(LayoutInflater.from(this.c).inflate(aVar.b, viewGroup, false));
                if (viewHolder instanceof TaoLiveRoomBaseVH) {
                    ((TaoLiveRoomBaseVH) viewHolder).setGlobalContext(this.d);
                    ((TaoLiveRoomBaseVH) viewHolder).init();
                    naj najVar = this.h;
                    if (najVar != null) {
                        ((TaoLiveRoomBaseVH) viewHolder).initMultiRoomVideoControllerObserver(najVar);
                    } else if (v2s.o().A() != null) {
                        v2s.o().A().c("VideoView", "BaseListAdapter onCreateViewHolder mMultiRoomVideoControllerObserver = null");
                    }
                }
                ((HashMap) this.J).put(Integer.valueOf(viewHolder.hashCode()), viewHolder);
                return viewHolder;
            } catch (Exception e) {
                if (v2s.o().A() == null) {
                    return null;
                }
                cwd A = v2s.o().A();
                A.c("BaseListAdapter", "onCreateViewHolder exception = " + N(e));
                return null;
            }
        } else if (v2s.o().A() == null) {
            return null;
        } else {
            cwd A2 = v2s.o().A();
            A2.c("BaseListAdapter", "onCreateViewHolder VHDefine null viewType = " + i);
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f14ed1", new Object[]{this, recyclerView});
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getItemCount(); i++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition instanceof IComponentLifeCycle2) {
                hashMap.put(Integer.valueOf(findViewHolderForAdapterPosition.hashCode()), findViewHolderForAdapterPosition);
                if (qvs.a0()) {
                    ((IComponentLifeCycle2) findViewHolderForAdapterPosition).onViewHolderDestroy();
                } else {
                    ((IComponentLifeCycle2) findViewHolderForAdapterPosition).onDestroy();
                }
            }
        }
        if (qvs.a0()) {
            try {
                for (RecyclerView.ViewHolder viewHolder : ((HashMap) this.J).values()) {
                    if (!hashMap.containsKey(Integer.valueOf(viewHolder.hashCode()))) {
                        if (viewHolder instanceof IComponentLifeCycle2) {
                            ((IComponentLifeCycle2) viewHolder).onViewHolderDestroy();
                        }
                        if (viewHolder instanceof TaoLiveRoomBaseVH) {
                            ((TaoLiveRoomBaseVH) viewHolder).setVHState(State.INITIAL);
                        }
                    }
                }
                ((HashMap) this.J).clear();
            } catch (Exception e) {
                x5t.h("BaseListAdapter", "onDetachedFromRecyclerView mVHCache exception = " + N(e));
            }
        }
        this.f13272a = false;
        if (d4s.e("enableLifeCycleUnclosedMonitor", true)) {
            this.i.a(this.d);
        }
    }
}
