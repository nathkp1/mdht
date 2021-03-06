/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.codesystem.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.openhealthtools.mdht.cts2.codesystem.util.CodeSystemAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CodeSystemItemProviderAdapterFactory extends CodeSystemAdapterFactory implements
		ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemCatalogEntryItemProvider codeSystemCatalogEntryItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCodeSystemCatalogEntryAdapter() {
		if (codeSystemCatalogEntryItemProvider == null) {
			codeSystemCatalogEntryItemProvider = new CodeSystemCatalogEntryItemProvider(this);
		}

		return codeSystemCatalogEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryDirectory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemCatalogEntryDirectoryItemProvider codeSystemCatalogEntryDirectoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryDirectory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCodeSystemCatalogEntryDirectoryAdapter() {
		if (codeSystemCatalogEntryDirectoryItemProvider == null) {
			codeSystemCatalogEntryDirectoryItemProvider = new CodeSystemCatalogEntryDirectoryItemProvider(this);
		}

		return codeSystemCatalogEntryDirectoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemCatalogEntryListItemProvider codeSystemCatalogEntryListItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCodeSystemCatalogEntryListAdapter() {
		if (codeSystemCatalogEntryListItemProvider == null) {
			codeSystemCatalogEntryListItemProvider = new CodeSystemCatalogEntryListItemProvider(this);
		}

		return codeSystemCatalogEntryListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryListEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemCatalogEntryListEntryItemProvider codeSystemCatalogEntryListEntryItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryListEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCodeSystemCatalogEntryListEntryAdapter() {
		if (codeSystemCatalogEntryListEntryItemProvider == null) {
			codeSystemCatalogEntryListEntryItemProvider = new CodeSystemCatalogEntryListEntryItemProvider(this);
		}

		return codeSystemCatalogEntryListEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemCatalogEntryMsgItemProvider codeSystemCatalogEntryMsgItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCodeSystemCatalogEntryMsgAdapter() {
		if (codeSystemCatalogEntryMsgItemProvider == null) {
			codeSystemCatalogEntryMsgItemProvider = new CodeSystemCatalogEntryMsgItemProvider(this);
		}

		return codeSystemCatalogEntryMsgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemCatalogEntrySummaryItemProvider codeSystemCatalogEntrySummaryItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCodeSystemCatalogEntrySummaryAdapter() {
		if (codeSystemCatalogEntrySummaryItemProvider == null) {
			codeSystemCatalogEntrySummaryItemProvider = new CodeSystemCatalogEntrySummaryItemProvider(this);
		}

		return codeSystemCatalogEntrySummaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null
				? this
				: parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void dispose() {
		if (codeSystemCatalogEntryItemProvider != null) {
			codeSystemCatalogEntryItemProvider.dispose();
		}
		if (codeSystemCatalogEntryDirectoryItemProvider != null) {
			codeSystemCatalogEntryDirectoryItemProvider.dispose();
		}
		if (codeSystemCatalogEntryListItemProvider != null) {
			codeSystemCatalogEntryListItemProvider.dispose();
		}
		if (codeSystemCatalogEntryListEntryItemProvider != null) {
			codeSystemCatalogEntryListEntryItemProvider.dispose();
		}
		if (codeSystemCatalogEntryMsgItemProvider != null) {
			codeSystemCatalogEntryMsgItemProvider.dispose();
		}
		if (codeSystemCatalogEntrySummaryItemProvider != null) {
			codeSystemCatalogEntrySummaryItemProvider.dispose();
		}
		if (documentRootItemProvider != null) {
			documentRootItemProvider.dispose();
		}
	}

}
