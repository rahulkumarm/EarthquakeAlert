package com.exercise.earthquakes.databinding;
import com.exercise.earthquakes.R;
import com.exercise.earthquakes.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EarthquakeItemBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final android.widget.TextView eqItemDepth;
    @NonNull
    public final android.widget.TextView eqItemEqid;
    @NonNull
    public final android.widget.TextView eqItemLocation;
    @NonNull
    public final android.widget.TextView eqItemMagnitude;
    @NonNull
    public final android.widget.TextView eqItemSrc;
    @NonNull
    public final android.widget.TextView eqItemTime;
    @NonNull
    private final android.support.v7.widget.CardView mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    @Nullable
    private com.exercise.earthquakes.ui.databinding.EarthquakeItemActions mActionItem;
    @Nullable
    private com.exercise.earthquakes.model.EarthquakeItem mEq;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EarthquakeItemBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.eqItemDepth = (android.widget.TextView) bindings[4];
        this.eqItemDepth.setTag(null);
        this.eqItemEqid = (android.widget.TextView) bindings[8];
        this.eqItemEqid.setTag(null);
        this.eqItemLocation = (android.widget.TextView) bindings[5];
        this.eqItemLocation.setTag(null);
        this.eqItemMagnitude = (android.widget.TextView) bindings[6];
        this.eqItemMagnitude.setTag(null);
        this.eqItemSrc = (android.widget.TextView) bindings[7];
        this.eqItemSrc.setTag(null);
        this.eqItemTime = (android.widget.TextView) bindings[3];
        this.eqItemTime.setTag(null);
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.actionItem == variableId) {
            setActionItem((com.exercise.earthquakes.ui.databinding.EarthquakeItemActions) variable);
        }
        else if (BR.eq == variableId) {
            setEq((com.exercise.earthquakes.model.EarthquakeItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setActionItem(@Nullable com.exercise.earthquakes.ui.databinding.EarthquakeItemActions ActionItem) {
        this.mActionItem = ActionItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.actionItem);
        super.requestRebind();
    }
    @Nullable
    public com.exercise.earthquakes.ui.databinding.EarthquakeItemActions getActionItem() {
        return mActionItem;
    }
    public void setEq(@Nullable com.exercise.earthquakes.model.EarthquakeItem Eq) {
        this.mEq = Eq;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.eq);
        super.requestRebind();
    }
    @Nullable
    public com.exercise.earthquakes.model.EarthquakeItem getEq() {
        return mEq;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.exercise.earthquakes.ui.databinding.EarthquakeItemActions actionItem = mActionItem;
        double eqMagnitude = 0.0;
        java.lang.String stringFormatEqItemTimeAndroidStringEarthquakeItemTimeEqDatetime = null;
        int eqMagnitudeInt8ViewVISIBLEViewGONE = 0;
        java.lang.String eqSrc = null;
        java.lang.String eqEqid = null;
        java.lang.String stringFormatEqItemDepthAndroidStringEarthquakeItemDepthEqDepth = null;
        java.lang.String stringFormatEqItemEqidAndroidStringEarthquakeItemIdEqEqid = null;
        java.lang.String stringFormatEqItemLocationAndroidStringEarthquakeItemLocationEqLocation = null;
        com.exercise.earthquakes.model.EarthquakeItem eq = mEq;
        java.lang.String eqLocation = null;
        boolean eqMagnitudeInt8 = false;
        java.lang.String eqDepth = null;
        java.lang.String stringFormatEqItemMagnitudeAndroidStringEarthquakeItemMagnitudeEqMagnitude = null;
        java.lang.String eqDatetime = null;
        java.lang.String stringFormatEqItemSrcAndroidStringEarthquakeItemSrcEqSrc = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (eq != null) {
                    // read eq.magnitude
                    eqMagnitude = eq.getMagnitude();
                    // read eq.src
                    eqSrc = eq.getSrc();
                    // read eq.eqid
                    eqEqid = eq.getEqid();
                    // read eq.location
                    eqLocation = eq.getLocation();
                    // read eq.depth
                    eqDepth = eq.getDepth();
                    // read eq.datetime
                    eqDatetime = eq.getDatetime();
                }


                // read eq.magnitude >= 8
                eqMagnitudeInt8 = (eqMagnitude) >= (8);
                // read String.format(@android:string/earthquake_item_magnitude, eq.magnitude)
                stringFormatEqItemMagnitudeAndroidStringEarthquakeItemMagnitudeEqMagnitude = java.lang.String.format(eqItemMagnitude.getResources().getString(R.string.earthquake_item_magnitude), eqMagnitude);
                // read String.format(@android:string/earthquake_item_src, eq.src)
                stringFormatEqItemSrcAndroidStringEarthquakeItemSrcEqSrc = java.lang.String.format(eqItemSrc.getResources().getString(R.string.earthquake_item_src), eqSrc);
                // read String.format(@android:string/earthquake_item_id, eq.eqid)
                stringFormatEqItemEqidAndroidStringEarthquakeItemIdEqEqid = java.lang.String.format(eqItemEqid.getResources().getString(R.string.earthquake_item_id), eqEqid);
                // read String.format(@android:string/earthquake_item_location, eq.location)
                stringFormatEqItemLocationAndroidStringEarthquakeItemLocationEqLocation = java.lang.String.format(eqItemLocation.getResources().getString(R.string.earthquake_item_location), eqLocation);
                // read String.format(@android:string/earthquake_item_depth, eq.depth)
                stringFormatEqItemDepthAndroidStringEarthquakeItemDepthEqDepth = java.lang.String.format(eqItemDepth.getResources().getString(R.string.earthquake_item_depth), eqDepth);
                // read String.format(@android:string/earthquake_item_time, eq.datetime)
                stringFormatEqItemTimeAndroidStringEarthquakeItemTimeEqDatetime = java.lang.String.format(eqItemTime.getResources().getString(R.string.earthquake_item_time), eqDatetime);
            if((dirtyFlags & 0x6L) != 0) {
                if(eqMagnitudeInt8) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read eq.magnitude >= 8 ? View.VISIBLE : View.GONE
                eqMagnitudeInt8ViewVISIBLEViewGONE = ((eqMagnitudeInt8) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.eqItemDepth, stringFormatEqItemDepthAndroidStringEarthquakeItemDepthEqDepth);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.eqItemEqid, stringFormatEqItemEqidAndroidStringEarthquakeItemIdEqEqid);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.eqItemLocation, stringFormatEqItemLocationAndroidStringEarthquakeItemLocationEqLocation);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.eqItemMagnitude, stringFormatEqItemMagnitudeAndroidStringEarthquakeItemMagnitudeEqMagnitude);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.eqItemSrc, stringFormatEqItemSrcAndroidStringEarthquakeItemSrcEqSrc);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.eqItemTime, stringFormatEqItemTimeAndroidStringEarthquakeItemTimeEqDatetime);
            this.mboundView2.setVisibility(eqMagnitudeInt8ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // actionItem
        com.exercise.earthquakes.ui.databinding.EarthquakeItemActions actionItem = mActionItem;
        // eq
        com.exercise.earthquakes.model.EarthquakeItem eq = mEq;
        // actionItem != null
        boolean actionItemJavaLangObjectNull = false;



        actionItemJavaLangObjectNull = (actionItem) != (null);
        if (actionItemJavaLangObjectNull) {




            actionItem.openMapView(callbackArg_0, eq);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static EarthquakeItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static EarthquakeItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<EarthquakeItemBinding>inflate(inflater, com.exercise.earthquakes.R.layout.earthquake_item, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static EarthquakeItemBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static EarthquakeItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.exercise.earthquakes.R.layout.earthquake_item, null, false), bindingComponent);
    }
    @NonNull
    public static EarthquakeItemBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static EarthquakeItemBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/earthquake_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new EarthquakeItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): actionItem
        flag 1 (0x2L): eq
        flag 2 (0x3L): null
        flag 3 (0x4L): eq.magnitude >= 8 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): eq.magnitude >= 8 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}