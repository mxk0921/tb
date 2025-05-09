package com.taobao.browser.jsbridge.ui.chooseImg;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.List;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ImgsAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context context;
    public List<String> data;
    public OnItemClickClass onItemClickClass;
    public ImgChooseUtils util;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class ImgClallBackLisner implements ImgCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int num;

        static {
            t2o.a(619708610);
            t2o.a(619708595);
        }

        public ImgClallBackLisner(int i) {
            this.num = i;
        }

        @Override // com.taobao.browser.jsbridge.ui.chooseImg.ImgCallBack
        public void resultImgCall(ImageView imageView, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff219569", new Object[]{this, imageView, bitmap});
                return;
            }
            if (imageView.getTag() instanceof ImgHolder) {
                ImgHolder imgHolder = (ImgHolder) imageView.getTag();
                if (this.num != imgHolder.index) {
                    String str = ImgsActivity.TAG;
                    v7t.n(str, "ignore img bitmap callback for:" + this.num + ",holder index:" + imgHolder.index);
                    return;
                }
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface OnItemClickClass {
        void OnItemClick(View view, int i, CheckBox checkBox);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class OnPhotoClick implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public CheckBox checkBox;
        public int position;

        static {
            t2o.a(619708612);
        }

        public OnPhotoClick(int i, CheckBox checkBox) {
            this.position = i;
            this.checkBox = checkBox;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OnItemClickClass onItemClickClass;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ImgsAdapter imgsAdapter = ImgsAdapter.this;
            if (imgsAdapter.data != null && (onItemClickClass = imgsAdapter.onItemClickClass) != null) {
                onItemClickClass.OnItemClick(view, this.position, this.checkBox);
            }
        }
    }

    static {
        t2o.a(619708609);
    }

    public ImgsAdapter(Context context, List<String> list, OnItemClickClass onItemClickClass) {
        this.context = context;
        this.data = list;
        this.onItemClickClass = onItemClickClass;
        this.util = new ImgChooseUtils(context);
    }

    public static /* synthetic */ Object ipc$super(ImgsAdapter imgsAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/ui/chooseImg/ImgsAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.data.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        return this.data.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImgHolder imgHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = LayoutInflater.from(this.context).inflate(R.layout.camera_imgsitem, (ViewGroup) null);
            imgHolder = new ImgHolder();
            imgHolder.imageView = (ImageView) view.findViewById(R.id.imgItemView);
            imgHolder.checkBox = (CheckBox) view.findViewById(R.id.imgCheckBox);
            view.setTag(imgHolder);
        } else {
            imgHolder = (ImgHolder) view.getTag();
            if (((ImgsActivity) this.context).fileList.contains(this.data.get(i))) {
                imgHolder.checkBox.setChecked(true);
            } else {
                imgHolder.checkBox.setChecked(false);
            }
        }
        imgHolder.index = i;
        imgHolder.imageView.setImageResource(R.drawable.camera_pictures_no);
        imgHolder.imageView.setTag(imgHolder);
        this.util.imgExcute(imgHolder, new ImgClallBackLisner(i), this.data.get(i));
        ViewProxy.setOnClickListener(view, new OnPhotoClick(i, imgHolder.checkBox));
        return view;
    }
}
