package com.ali.user.mobile.register.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.exifinterface.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseDialogFragment;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.ui.widget.AUBladeView;
import com.ali.user.mobile.ui.widget.AUPinnedHeaderListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RegionDialogFragment extends BaseDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String[] b = {"A", "B", "C", TLogTracker.LEVEL_DEBUG, "E", UTConstant.Args.UT_SUCCESS_F, "G", "H", TLogTracker.LEVEL_INFO, "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", "V", "W", "X", "Y", "Z"};
    private RegionAdapter mAdapter;
    private View mCloseTV;
    private RegionInfo mCurrentRegion;
    private List<String> mLetterList;
    private HashMap<String, Integer> mLetterMap;
    public AUBladeView mLetterView;
    private List<RegionInfo> mList;
    private AUPinnedHeaderListView mListView;
    private RegionListener mRegionListener;

    static {
        t2o.a(70254842);
    }

    public static /* synthetic */ HashMap access$000(RegionDialogFragment regionDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1664bd26", new Object[]{regionDialogFragment});
        }
        return regionDialogFragment.mLetterMap;
    }

    public static /* synthetic */ AUPinnedHeaderListView access$100(RegionDialogFragment regionDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AUPinnedHeaderListView) ipChange.ipc$dispatch("84e54a8d", new Object[]{regionDialogFragment});
        }
        return regionDialogFragment.mListView;
    }

    public static /* synthetic */ List access$200(RegionDialogFragment regionDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dffe7422", new Object[]{regionDialogFragment});
        }
        return regionDialogFragment.mList;
    }

    public static /* synthetic */ RegionListener access$300(RegionDialogFragment regionDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegionListener) ipChange.ipc$dispatch("d41d0920", new Object[]{regionDialogFragment});
        }
        return regionDialogFragment.mRegionListener;
    }

    private int getSelection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb420c50", new Object[]{this})).intValue();
        }
        RegionInfo regionInfo = this.mCurrentRegion;
        if (regionInfo == null || TextUtils.isEmpty(regionInfo.domain) || this.mList == null) {
            return 0;
        }
        for (int i = 0; i < this.mList.size(); i++) {
            RegionInfo regionInfo2 = this.mList.get(i);
            if (!(regionInfo2 == null || TextUtils.isEmpty(regionInfo2.domain) || !regionInfo2.domain.equals(this.mCurrentRegion.domain))) {
                return i;
            }
        }
        return 0;
    }

    public static /* synthetic */ Object ipc$super(RegionDialogFragment regionDialogFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 2133689546) {
            super.onStart();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/ali/user/mobile/register/ui/RegionDialogFragment");
        }
    }

    public List<RegionInfo> getList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("85f5d54c", new Object[]{this});
        }
        return this.mList;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.AliUserDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RegionAdapter regionAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().requestWindowFeature(1);
        View inflate = layoutInflater.inflate(R.layout.aliuser_register_region_fragment, viewGroup);
        View findViewById = inflate.findViewById(R.id.aliuser_custom_back);
        this.mCloseTV = findViewById;
        ViewProxy.setOnClickListener(findViewById, new View.OnClickListener() { // from class: com.ali.user.mobile.register.ui.RegionDialogFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    RegionDialogFragment.this.dismissAllowingStateLoss();
                }
            }
        });
        this.mLetterView = (AUBladeView) inflate.findViewById(R.id.contacts_letters_list);
        if (DataProviderFactory.getDataProvider().isForigenLocation()) {
            this.mLetterView.setArray(this.b);
        }
        AUPinnedHeaderListView aUPinnedHeaderListView = (AUPinnedHeaderListView) inflate.findViewById(R.id.aliuser_region_listview);
        this.mListView = aUPinnedHeaderListView;
        if (!(aUPinnedHeaderListView == null || (regionAdapter = this.mAdapter) == null)) {
            aUPinnedHeaderListView.setAdapter((ListAdapter) regionAdapter);
            this.mListView.setDivider(null);
            this.mListView.setPinnedHeaderView(LayoutInflater.from(getActivity()).inflate(R.layout.aliuser_contact_list_head, (ViewGroup) this.mListView, false));
            if (this.mCurrentRegion != null) {
                int selection = getSelection();
                this.mListView.setSelection(selection);
                this.mListView.setItemChecked(selection, true);
                this.mAdapter.setSelectedItem(this.mCurrentRegion);
            }
            this.mLetterView.setOnItemClickListener(new AUBladeView.OnItemClickListener() { // from class: com.ali.user.mobile.register.ui.RegionDialogFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.AUBladeView.OnItemClickListener
                public void onItemClick(String str) {
                    int intValue;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7d50b127", new Object[]{this, str});
                    } else if (RegionDialogFragment.access$000(RegionDialogFragment.this) != null && str != null && RegionDialogFragment.access$000(RegionDialogFragment.this).containsKey(str) && (intValue = ((Integer) RegionDialogFragment.access$000(RegionDialogFragment.this).get(str)).intValue()) != -1) {
                        RegionDialogFragment.access$100(RegionDialogFragment.this).setSelection(intValue);
                    }
                }
            });
            this.mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.ali.user.mobile.register.ui.RegionDialogFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                    } else if (RegionDialogFragment.access$200(RegionDialogFragment.this) != null) {
                        RegionInfo regionInfo = (RegionInfo) RegionDialogFragment.access$200(RegionDialogFragment.this).get(i);
                        new Intent().putExtra("region", regionInfo);
                        RegionDialogFragment.this.dismissAllowingStateLoss();
                        if (RegionDialogFragment.access$300(RegionDialogFragment.this) != null) {
                            RegionDialogFragment.access$300(RegionDialogFragment.this).onClick(regionInfo);
                        }
                    }
                }
            });
        }
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            dialog.getWindow().setLayout(displayMetrics.widthPixels, (int) (displayMetrics.heightPixels * 0.9d));
            WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
            attributes.gravity = 80;
            getDialog().getWindow().setAttributes(attributes);
        }
    }

    public void setCurrentRegion(RegionInfo regionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46fe2fd1", new Object[]{this, regionInfo});
            return;
        }
        this.mCurrentRegion = regionInfo;
        if (DataProviderFactory.getDataProvider().isForigenLocation()) {
            ArrayList arrayList = new ArrayList();
            if (this.mList != null) {
                RegionInfo regionInfo2 = this.mCurrentRegion;
                RegionInfo regionInfo3 = null;
                if (regionInfo2 != null && !TextUtils.isEmpty(regionInfo2.domain)) {
                    for (int i = 0; i < this.mList.size(); i++) {
                        RegionInfo regionInfo4 = this.mList.get(i);
                        if (regionInfo4 == null || TextUtils.isEmpty(regionInfo4.domain) || !regionInfo4.domain.equals(this.mCurrentRegion.domain)) {
                            arrayList.add(regionInfo4);
                        } else {
                            regionInfo3 = regionInfo4;
                        }
                    }
                }
                if (regionInfo3 != null) {
                    arrayList.add(0, regionInfo3);
                }
                this.mList = arrayList;
            }
        }
    }

    public void setList(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd643e0c", new Object[]{this, list, hashMap, list2});
            return;
        }
        this.mList = list;
        this.mLetterMap = hashMap;
        this.mLetterList = list2;
    }

    public void setRegionListener(RegionListener regionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da975721", new Object[]{this, regionListener});
        } else {
            this.mRegionListener = regionListener;
        }
    }

    public void setupAdapter(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ace044f", new Object[]{this, context});
            return;
        }
        RegionAdapter regionAdapter = new RegionAdapter(context, this.mList);
        this.mAdapter = regionAdapter;
        regionAdapter.setTextNumberTogether(true);
    }
}
