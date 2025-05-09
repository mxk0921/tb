package com.taobao.taolive.sdk.controller;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.controller2.state.State;
import tb.d4s;
import tb.jae;
import tb.qvs;
import tb.t2o;
import tb.x5t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BaseListAdapterV2 extends BaseListAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseListAdapterV2";
    public jae j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$room$controller2$state$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$taobao$taolive$room$controller2$state$State = iArr;
            try {
                iArr[State.APPEARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$controller2$state$State[State.TRANSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$controller2$state$State[State.INITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(779093421);
    }

    public BaseListAdapterV2(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(BaseListAdapterV2 baseListAdapterV2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/controller/BaseListAdapterV2");
    }

    public final void c0(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55af3e80", new Object[]{this, viewHolder});
        } else if ((viewHolder instanceof IComponentLifeCycle2) && (viewHolder instanceof TaoLiveRoomBaseVH)) {
            StringBuilder sb = new StringBuilder("VH position = ");
            sb.append(viewHolder.getAdapterPosition());
            sb.append(" ViewItemId = ");
            View view = viewHolder.itemView;
            int i = R.id.tblive_tag_key_model;
            sb.append(((IRecyclerModel) view.getTag(i)).getViewItemId());
            sb.append(" onDidAppear()");
            x5t.h(TAG, sb.toString());
            ((IComponentLifeCycle2) viewHolder).onDidAppear();
            this.e = viewHolder;
            this.f = ((IRecyclerModel) viewHolder.itemView.getTag(i)).getViewItemId();
        }
    }

    public final void d0(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2297a68e", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof IComponentLifeCycle2) {
            x5t.h(TAG, "VH position = " + viewHolder.getAdapterPosition() + " ViewItemId = " + ((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId() + " onDidDisappear()");
            ((IComponentLifeCycle2) viewHolder).onDidDisappear();
        }
    }

    public final void e0(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca704acf", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof IComponentLifeCycle2) {
            StringBuilder sb = new StringBuilder("VH position = ");
            sb.append(viewHolder.getAdapterPosition());
            sb.append(" ViewItemId = ");
            View view = viewHolder.itemView;
            int i = R.id.tblive_tag_key_model;
            sb.append(((IRecyclerModel) view.getTag(i)).getViewItemId());
            sb.append(" onViewHolderDidAppear()");
            x5t.h(TAG, sb.toString());
            ((IComponentLifeCycle2) viewHolder).onViewHolderDidAppear();
            this.e = viewHolder;
            this.f = ((IRecyclerModel) viewHolder.itemView.getTag(i)).getViewItemId();
        }
    }

    public final void f0(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efcf03df", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof IComponentLifeCycle2) {
            x5t.h(TAG, "VH position = " + viewHolder.getAdapterPosition() + " ViewItemId = " + ((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId() + " onViewHolderDidDisappear()");
            ((IComponentLifeCycle2) viewHolder).onViewHolderDidDisappear();
        }
    }

    public final void g0(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a7a042", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof IComponentLifeCycle2) {
            x5t.h(TAG, "VH position = " + viewHolder.getAdapterPosition() + " ViewItemId = " + ((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId() + " onViewHolderWillAppear()");
            ((IComponentLifeCycle2) viewHolder).onViewHolderWillAppear();
        }
    }

    public final void h0(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0fd58c", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof IComponentLifeCycle2) {
            x5t.h(TAG, "VH position = " + viewHolder.getAdapterPosition() + " ViewItemId = " + ((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId() + " onViewHolderWillDisappear()");
            ((IComponentLifeCycle2) viewHolder).onViewHolderWillDisappear();
        }
    }

    public final void i0(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4722b1", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof IComponentLifeCycle2) {
            x5t.h(TAG, "VH position = " + viewHolder.getAdapterPosition() + " ViewItemId = " + ((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId() + " onWillAppear()");
            ((IComponentLifeCycle2) viewHolder).onWillAppear();
        }
    }

    public final void j0(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755b88bd", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof IComponentLifeCycle2) {
            x5t.h(TAG, "VH position = " + viewHolder.getAdapterPosition() + " ViewItemId = " + ((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId() + " onWillDisappear()");
            ((IComponentLifeCycle2) viewHolder).onWillDisappear();
        }
    }

    public void k0(jae jaeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de86854", new Object[]{this, jaeVar});
        } else {
            this.j = jaeVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
            return;
        }
        jae jaeVar = this.j;
        if (jaeVar != null) {
            ((BaseListController) jaeVar).q(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acd87b", new Object[]{this, viewHolder});
            return;
        }
        jae jaeVar = this.j;
        if (jaeVar != null) {
            ((BaseListController) jaeVar).w(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof TaoLiveRoomBaseVH) {
            State vHState = ((TaoLiveRoomBaseVH) viewHolder).getVHState();
            State state = State.INITIAL;
            if (vHState == state) {
                return;
            }
            if (qvs.u()) {
                a0(viewHolder, state);
            } else {
                b0(viewHolder, state);
            }
        }
    }

    @Override // com.taobao.taolive.sdk.controller.BaseListAdapter
    public void a0(RecyclerView.ViewHolder viewHolder, State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b69ac9c", new Object[]{this, viewHolder, state});
        } else if (viewHolder instanceof TaoLiveRoomBaseVH) {
            View view = viewHolder.itemView;
            int i = R.id.tblive_tag_key_model;
            if (view.getTag(i) instanceof IRecyclerModel) {
                TaoLiveRoomBaseVH taoLiveRoomBaseVH = (TaoLiveRoomBaseVH) viewHolder;
                State vHState = taoLiveRoomBaseVH.getVHState();
                x5t.h(TAG, vHState.toString() + " -> " + state.toString() + " VH position = " + viewHolder.getAdapterPosition() + " ViewItemId = " + ((IRecyclerModel) viewHolder.itemView.getTag(i)).getViewItemId());
                int i2 = a.$SwitchMap$com$taobao$taolive$room$controller2$state$State[state.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            x5t.h(TAG, "unknown newState = " + state + " VH position = " + viewHolder.getAdapterPosition() + " ViewItemId = " + ((IRecyclerModel) viewHolder.itemView.getTag(i)).getViewItemId());
                        } else {
                            if (d4s.e("enableUpDownLifeCycleCompensation", true) && vHState == State.APPEARED && this.f13272a) {
                                h0(viewHolder);
                            }
                            taoLiveRoomBaseVH.setDidAppeared(false);
                            f0(viewHolder);
                        }
                    } else if (vHState == State.INITIAL) {
                        g0(viewHolder);
                    } else if (vHState == State.APPEARED) {
                        h0(viewHolder);
                    }
                } else if (vHState == State.INITIAL) {
                    g0(viewHolder);
                    taoLiveRoomBaseVH.setDidAppeared(true);
                    e0(viewHolder);
                } else if (vHState == State.TRANSITION) {
                    taoLiveRoomBaseVH.setDidAppeared(true);
                    e0(viewHolder);
                }
                taoLiveRoomBaseVH.setVHState(state);
            }
        }
    }

    @Override // com.taobao.taolive.sdk.controller.BaseListAdapter
    public void b0(RecyclerView.ViewHolder viewHolder, State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8048ea", new Object[]{this, viewHolder, state});
        } else if (viewHolder instanceof TaoLiveRoomBaseVH) {
            View view = viewHolder.itemView;
            int i = R.id.tblive_tag_key_model;
            if (view.getTag(i) instanceof IRecyclerModel) {
                TaoLiveRoomBaseVH taoLiveRoomBaseVH = (TaoLiveRoomBaseVH) viewHolder;
                State vHState = taoLiveRoomBaseVH.getVHState();
                x5t.h(TAG, vHState.toString() + " -> " + state.toString() + " VH position = " + viewHolder.getAdapterPosition() + " ViewItemId = " + ((IRecyclerModel) viewHolder.itemView.getTag(i)).getViewItemId());
                int i2 = a.$SwitchMap$com$taobao$taolive$room$controller2$state$State[state.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            x5t.h(TAG, "unknown newState = " + state + " VH position = " + viewHolder.getAdapterPosition() + " ViewItemId = " + ((IRecyclerModel) viewHolder.itemView.getTag(i)).getViewItemId());
                        } else if (vHState == State.APPEARED) {
                            taoLiveRoomBaseVH.setDidAppeared(false);
                            d0(viewHolder);
                        } else if (vHState == State.TRANSITION) {
                            if (taoLiveRoomBaseVH.hasDidAppeared()) {
                                taoLiveRoomBaseVH.setDidAppeared(false);
                                d0(viewHolder);
                            } else {
                                j0(viewHolder);
                            }
                        }
                    } else if (vHState == State.INITIAL) {
                        i0(viewHolder);
                    }
                } else if (vHState == State.INITIAL) {
                    i0(viewHolder);
                    taoLiveRoomBaseVH.setDidAppeared(true);
                    c0(viewHolder);
                } else if (vHState == State.TRANSITION && !taoLiveRoomBaseVH.hasDidAppeared()) {
                    taoLiveRoomBaseVH.setDidAppeared(true);
                    c0(viewHolder);
                }
                taoLiveRoomBaseVH.setVHState(state);
            }
        }
    }
}
