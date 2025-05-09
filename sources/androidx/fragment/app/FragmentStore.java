package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FragmentStore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FragmentManager";
    private FragmentManagerViewModel mNonConfig;
    private final ArrayList<Fragment> mAdded = new ArrayList<>();
    private final HashMap<String, FragmentStateManager> mActive = new HashMap<>();
    private final HashMap<String, Bundle> mSavedState = new HashMap<>();

    public void addFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cc36f10", new Object[]{this, fragment});
        } else if (!this.mAdded.contains(fragment)) {
            synchronized (this.mAdded) {
                this.mAdded.add(fragment);
            }
            fragment.mAdded = true;
        } else {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    public void burpActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa86ed3e", new Object[]{this});
        } else {
            this.mActive.values().removeAll(Collections.singleton(null));
        }
    }

    public boolean containsActiveFragment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa85044a", new Object[]{this, str})).booleanValue();
        }
        if (this.mActive.get(str) != null) {
            return true;
        }
        return false;
    }

    public void dispatchStateChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18119cf5", new Object[]{this, new Integer(i)});
            return;
        }
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                fragmentStateManager.setFragmentManagerState(i);
            }
        }
    }

    public Fragment findActiveFragment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("1b3e072e", new Object[]{this, str});
        }
        FragmentStateManager fragmentStateManager = this.mActive.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.getFragment();
        }
        return null;
    }

    public Fragment findFragmentById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("aac14c4d", new Object[]{this, new Integer(i)});
        }
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = this.mAdded.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment2 = fragmentStateManager.getFragment();
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public Fragment findFragmentByTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c20cfb83", new Object[]{this, str});
        }
        if (str != null) {
            for (int size = this.mAdded.size() - 1; size >= 0; size--) {
                Fragment fragment = this.mAdded.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment2 = fragmentStateManager.getFragment();
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public Fragment findFragmentByWho(String str) {
        Fragment findFragmentByWho;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("b7da3ddf", new Object[]{this, str});
        }
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (!(fragmentStateManager == null || (findFragmentByWho = fragmentStateManager.getFragment().findFragmentByWho(str)) == null)) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public int findFragmentIndexInContainer(Fragment fragment) {
        View view;
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61c9dde5", new Object[]{this, fragment})).intValue();
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.mAdded.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.mAdded.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.mAdded.size()) {
                return -1;
            }
            Fragment fragment3 = this.mAdded.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public int getActiveFragmentCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b6ee2fd", new Object[]{this})).intValue();
        }
        return this.mActive.size();
    }

    public List<FragmentStateManager> getActiveFragmentStateManagers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8039e3f5", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager);
            }
        }
        return arrayList;
    }

    public List<Fragment> getActiveFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7780d9f9", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.getFragment());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public HashMap<String, Bundle> getAllSavedState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ef2e377f", new Object[]{this});
        }
        return this.mSavedState;
    }

    public FragmentStateManager getFragmentStateManager(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentStateManager) ipChange.ipc$dispatch("b38caf5f", new Object[]{this, str});
        }
        return this.mActive.get(str);
    }

    public List<Fragment> getFragments() {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("68dc9c53", new Object[]{this});
        }
        if (this.mAdded.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.mAdded) {
            arrayList = new ArrayList(this.mAdded);
        }
        return arrayList;
    }

    public FragmentManagerViewModel getNonConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManagerViewModel) ipChange.ipc$dispatch("2e30deb7", new Object[]{this});
        }
        return this.mNonConfig;
    }

    public Bundle getSavedState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b7264f55", new Object[]{this, str});
        }
        return this.mSavedState.get(str);
    }

    public void makeActive(FragmentStateManager fragmentStateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3fa1617", new Object[]{this, fragmentStateManager});
            return;
        }
        Fragment fragment = fragmentStateManager.getFragment();
        if (!containsActiveFragment(fragment.mWho)) {
            this.mActive.put(fragment.mWho, fragmentStateManager);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    this.mNonConfig.addRetainedFragment(fragment);
                } else {
                    this.mNonConfig.removeRetainedFragment(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                new StringBuilder("Added fragment to active set ").append(fragment);
            }
        }
    }

    public void makeInactive(FragmentStateManager fragmentStateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32009fc", new Object[]{this, fragmentStateManager});
            return;
        }
        Fragment fragment = fragmentStateManager.getFragment();
        if (fragment.mRetainInstance) {
            this.mNonConfig.removeRetainedFragment(fragment);
        }
        if (this.mActive.get(fragment.mWho) == fragmentStateManager && this.mActive.put(fragment.mWho, null) != null && FragmentManager.isLoggingEnabled(2)) {
            new StringBuilder("Removed fragment from active set ").append(fragment);
        }
    }

    public void moveToExpectedState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9966c7f4", new Object[]{this});
            return;
        }
        Iterator<Fragment> it = this.mAdded.iterator();
        while (it.hasNext()) {
            FragmentStateManager fragmentStateManager = this.mActive.get(it.next().mWho);
            if (fragmentStateManager != null) {
                fragmentStateManager.moveToExpectedState();
            }
        }
        for (FragmentStateManager fragmentStateManager2 : this.mActive.values()) {
            if (fragmentStateManager2 != null) {
                fragmentStateManager2.moveToExpectedState();
                Fragment fragment = fragmentStateManager2.getFragment();
                if (fragment.mRemoving && !fragment.isInBackStack()) {
                    if (fragment.mBeingSaved && !this.mSavedState.containsKey(fragment.mWho)) {
                        setSavedState(fragment.mWho, fragmentStateManager2.saveState());
                    }
                    makeInactive(fragmentStateManager2);
                }
            }
        }
    }

    public void removeFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5896e673", new Object[]{this, fragment});
            return;
        }
        synchronized (this.mAdded) {
            this.mAdded.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public void resetActiveFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad889ff5", new Object[]{this});
        } else {
            this.mActive.clear();
        }
    }

    public void restoreSaveState(HashMap<String, Bundle> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7048e6", new Object[]{this, hashMap});
            return;
        }
        this.mSavedState.clear();
        this.mSavedState.putAll(hashMap);
    }

    public ArrayList<String> saveActiveFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9621b61", new Object[]{this});
        }
        ArrayList<String> arrayList = new ArrayList<>(this.mActive.size());
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment = fragmentStateManager.getFragment();
                setSavedState(fragment.mWho, fragmentStateManager.saveState());
                arrayList.add(fragment.mWho);
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb = new StringBuilder("Saved state of ");
                    sb.append(fragment);
                    sb.append(": ");
                    sb.append(fragment.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<String> saveAddedFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("97e0b4c1", new Object[]{this});
        }
        synchronized (this.mAdded) {
            try {
                if (this.mAdded.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.mAdded.size());
                Iterator<Fragment> it = this.mAdded.iterator();
                while (it.hasNext()) {
                    Fragment next = it.next();
                    arrayList.add(next.mWho);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding fragment (");
                        sb.append(next.mWho);
                        sb.append("): ");
                        sb.append(next);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setNonConfig(FragmentManagerViewModel fragmentManagerViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e52fb55", new Object[]{this, fragmentManagerViewModel});
        } else {
            this.mNonConfig = fragmentManagerViewModel;
        }
    }

    public Bundle setSavedState(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("58fb68db", new Object[]{this, str, bundle});
        }
        if (bundle != null) {
            return this.mSavedState.put(str, bundle);
        }
        return this.mSavedState.remove(str);
    }

    public void restoreAddedFragments(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7dc7629", new Object[]{this, list});
            return;
        }
        this.mAdded.clear();
        if (list != null) {
            for (String str : list) {
                Fragment findActiveFragment = findActiveFragment(str);
                if (findActiveFragment != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb = new StringBuilder("restoreSaveState: added (");
                        sb.append(str);
                        sb.append("): ");
                        sb.append(findActiveFragment);
                    }
                    addFragment(findActiveFragment);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + f7l.BRACKET_END_STR);
                }
            }
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab37b0f", new Object[]{this, str, fileDescriptor, printWriter, strArr});
            return;
        }
        String str2 = str + "    ";
        if (!this.mActive.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    Fragment fragment = fragmentStateManager.getFragment();
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.mAdded.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.mAdded.get(i).toString());
            }
        }
    }
}
