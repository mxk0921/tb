package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Scene {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private Runnable mEnterAction;
    private Runnable mExitAction;
    private View mLayout;
    private int mLayoutId;
    private ViewGroup mSceneRoot;

    public Scene(ViewGroup viewGroup) {
        this.mLayoutId = -1;
        this.mSceneRoot = viewGroup;
    }

    public static Scene getCurrentScene(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scene) ipChange.ipc$dispatch("a2cf0ba8", new Object[]{viewGroup});
        }
        return (Scene) viewGroup.getTag(R.id.transition_current_scene);
    }

    public static Scene getSceneForLayout(ViewGroup viewGroup, int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scene) ipChange.ipc$dispatch("9305a6e1", new Object[]{viewGroup, new Integer(i), context});
        }
        int i2 = R.id.transition_scene_layoutid_cache;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i2);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i2, sparseArray);
        }
        Scene scene = (Scene) sparseArray.get(i);
        if (scene != null) {
            return scene;
        }
        Scene scene2 = new Scene(viewGroup, i, context);
        sparseArray.put(i, scene2);
        return scene2;
    }

    public static void setCurrentScene(ViewGroup viewGroup, Scene scene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a477ae", new Object[]{viewGroup, scene});
        } else {
            viewGroup.setTag(R.id.transition_current_scene, scene);
        }
    }

    public void enter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc95f5f", new Object[]{this});
            return;
        }
        if (this.mLayoutId > 0 || this.mLayout != null) {
            getSceneRoot().removeAllViews();
            if (this.mLayoutId > 0) {
                LayoutInflater.from(this.mContext).inflate(this.mLayoutId, this.mSceneRoot);
            } else {
                this.mSceneRoot.addView(this.mLayout);
            }
        }
        Runnable runnable = this.mEnterAction;
        if (runnable != null) {
            runnable.run();
        }
        setCurrentScene(this.mSceneRoot, this);
    }

    public void exit() {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81677ea5", new Object[]{this});
        } else if (getCurrentScene(this.mSceneRoot) == this && (runnable = this.mExitAction) != null) {
            runnable.run();
        }
    }

    public ViewGroup getSceneRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("e1a44dd6", new Object[]{this});
        }
        return this.mSceneRoot;
    }

    public boolean isCreatedFromLayoutResource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1f0a72b", new Object[]{this})).booleanValue();
        }
        if (this.mLayoutId > 0) {
            return true;
        }
        return false;
    }

    public void setEnterAction(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80720af1", new Object[]{this, runnable});
        } else {
            this.mEnterAction = runnable;
        }
    }

    public void setExitAction(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65753e7b", new Object[]{this, runnable});
        } else {
            this.mExitAction = runnable;
        }
    }

    private Scene(ViewGroup viewGroup, int i, Context context) {
        this.mContext = context;
        this.mSceneRoot = viewGroup;
        this.mLayoutId = i;
    }

    public Scene(ViewGroup viewGroup, View view) {
        this.mLayoutId = -1;
        this.mSceneRoot = viewGroup;
        this.mLayout = view;
    }
}
