package tb;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qxq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JUMP_TO_FRAGMENT = "jumpToFragment";
    public static final String KEY_FRAGMENT_ARGS = "fragmentArgs";
    public static final String KEY_FRAGMENT_BUNDLE = "fragmentBundle";
    public static final String KEY_FRAGMENT_JUMP = "jumpByFragment";
    public static final String KEY_FRAGMENT_NAME = "fragmentName";
    public static final String KEY_NEW_DETAIL_IMMERSIVE = "newDetail_immersive";
    public static final String OPEN_FRAGMENT_JUMP = "true";
    public static final String SAVE_INSTANCE_ANDROID_FRAGMENT_NAME = "androidFragmentCount";
    public static final String SAVE_INSTANCE_ANDROID_SUPPORT_FRAGMENT_NAME = "androidSupportFragmentCount";
    public static final String SAVE_INSTANCE_MODULE_NAME = "tbMainFragment";
    public static final String SAVE_INSTANCE_MONITOR_POINT_NAME = "saveInstanceStateNotNullCount";
    public static final String SUB_KEY_FRAGMENT_JUMP = "subBizType";
    public static final String THREE_FLOORS = "threeFloorsCount";

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f26987a = new AtomicBoolean(false);

    static {
        t2o.a(775946378);
    }

    public static <T extends ISupportFragment> T a(Class<T> cls, String str, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ISupportFragment) ipChange.ipc$dispatch("bec79974", new Object[]{cls, str, fragmentManager}));
        }
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        if (str == null) {
            str = cls.getName();
        }
        for (int i = backStackEntryCount - 1; i >= 0; i--) {
            FragmentManager.BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(i);
            if (str.equals(backStackEntryAt.getName())) {
                Fragment findFragmentByTag = fragmentManager.findFragmentByTag(backStackEntryAt.getName());
                if (findFragmentByTag instanceof ISupportFragment) {
                    return (T) ((ISupportFragment) findFragmentByTag);
                }
            }
        }
        return null;
    }

    public static ViewGroup b(Activity activity, Fragment fragment, int i) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("25ca9e7d", new Object[]{activity, fragment, new Integer(i)});
        }
        if (fragment.getView() == null) {
            return null;
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment == null) {
            obj = activity.findViewById(i);
        } else if (parentFragment.getView() != null) {
            obj = parentFragment.getView().findViewById(i);
        } else {
            obj = b(activity, parentFragment, i);
        }
        if (obj instanceof ViewGroup) {
            return (ViewGroup) obj;
        }
        return null;
    }

    public static <T extends ISupportFragment> T c(FragmentManager fragmentManager, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ISupportFragment) ipChange.ipc$dispatch("d2eea855", new Object[]{fragmentManager, cls}));
        }
        return (T) d(cls, null, fragmentManager);
    }

    public static <T extends ISupportFragment> T d(Class<T> cls, String str, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ISupportFragment) ipChange.ipc$dispatch("b45d1ad", new Object[]{cls, str, fragmentManager}));
        }
        Fragment fragment = null;
        if (str == null) {
            List<Fragment> e = e(fragmentManager);
            if (e != null) {
                int size = e.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    Fragment fragment2 = e.get(size);
                    if ((fragment2 instanceof ISupportFragment) && fragment2.getClass().getName().equals(cls.getName())) {
                        fragment = fragment2;
                        break;
                    }
                    size--;
                }
            } else {
                return null;
            }
        } else {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
            if (findFragmentByTag == null) {
                return null;
            }
            fragment = findFragmentByTag;
        }
        return (T) ((ISupportFragment) fragment);
    }

    public static List<Fragment> e(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("50cfdf0a", new Object[]{fragmentManager});
        }
        return fragmentManager.getFragments();
    }

    public static int f(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c73710ee", new Object[]{fragmentManager})).intValue();
        }
        return fragmentManager.getFragments().size();
    }

    public static ISupportFragment g(Fragment fragment) {
        List<Fragment> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISupportFragment) ipChange.ipc$dispatch("92c4271b", new Object[]{fragment});
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null || (e = e(fragmentManager)) == null) {
            return null;
        }
        for (int indexOf = e.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
            Fragment fragment2 = e.get(indexOf);
            if (fragment2 instanceof ISupportFragment) {
                return (ISupportFragment) fragment2;
            }
        }
        return null;
    }

    public static ISupportFragment h(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISupportFragment) ipChange.ipc$dispatch("aa0c9142", new Object[]{fragmentManager});
        }
        return i(fragmentManager, 0);
    }

    public static ISupportFragment i(FragmentManager fragmentManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISupportFragment) ipChange.ipc$dispatch("bb2cdfa9", new Object[]{fragmentManager, new Integer(i)});
        }
        List<Fragment> e = e(fragmentManager);
        if (e == null) {
            return null;
        }
        for (int size = e.size() - 1; size >= 0; size--) {
            Fragment fragment = e.get(size);
            if (fragment instanceof ISupportFragment) {
                ISupportFragment iSupportFragment = (ISupportFragment) fragment;
                if (i == 0 || i == iSupportFragment.getSupportDelegate().f) {
                    return iSupportFragment;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r5 < r3) goto L_0x004a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        r5 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<androidx.fragment.app.Fragment> j(androidx.fragment.app.FragmentManager r7, java.lang.String r8, boolean r9) {
        /*
            r0 = -1
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.qxq.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0021
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r9)
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r3 = 0
            r9[r3] = r7
            r9[r1] = r8
            r7 = 2
            r9[r7] = r0
            java.lang.String r7 = "29cc6447"
            java.lang.Object r7 = r2.ipc$dispatch(r7, r9)
            java.util.List r7 = (java.util.List) r7
            return r7
        L_0x0021:
            androidx.fragment.app.Fragment r8 = r7.findFragmentByTag(r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r7 = e(r7)
            if (r7 != 0) goto L_0x0031
            return r2
        L_0x0031:
            int r3 = r7.size()
            int r4 = r3 + (-1)
            r5 = r4
        L_0x0038:
            if (r5 < 0) goto L_0x0049
            java.lang.Object r6 = r7.get(r5)
            if (r8 != r6) goto L_0x0047
            if (r9 == 0) goto L_0x0043
            goto L_0x004a
        L_0x0043:
            int r5 = r5 + r1
            if (r5 >= r3) goto L_0x0049
            goto L_0x004a
        L_0x0047:
            int r5 = r5 + r0
            goto L_0x0038
        L_0x0049:
            r5 = -1
        L_0x004a:
            if (r5 != r0) goto L_0x004d
            return r2
        L_0x004d:
            if (r4 < r5) goto L_0x0062
            java.lang.Object r8 = r7.get(r4)
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            if (r8 == 0) goto L_0x0060
            android.view.View r9 = r8.getView()
            if (r9 == 0) goto L_0x0060
            r2.add(r8)
        L_0x0060:
            int r4 = r4 + r0
            goto L_0x004d
        L_0x0062:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qxq.j(androidx.fragment.app.FragmentManager, java.lang.String, boolean):java.util.List");
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("130f8e2", new Object[0])).booleanValue();
        }
        return f26987a.get();
    }

    public static boolean l(Fragment fragment, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59af7375", new Object[]{fragment, fragmentManager})).booleanValue();
        }
        if (fragment == null) {
            return false;
        }
        return fragment.equals(h(fragmentManager));
    }

    public static boolean m(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f55c24c", new Object[]{fragmentManager})).booleanValue();
        }
        ISupportFragment h = h(fragmentManager);
        if (h != null) {
            return "com.taobao.tao.tbmainfragment.TBMainFragment".equals(h.asFragment().getClass().getName());
        }
        return false;
    }

    public static void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483fab7e", new Object[]{new Boolean(z)});
        } else {
            f26987a.set(z);
        }
    }
}
