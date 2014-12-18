/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.andmore.android.model.resources.types;

/**
 * Class that represents a <resources> node on a resource file
 *
 * Format: <resources> <string ...> <color ...> <drawable ...> <dimen ...>
 * </resources>
 */
public class ResourcesNode extends AbstractResourceNode {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.motorola.studio.android.model.resources.AbstractResourceNode#
	 * canAddChildNode
	 * (com.motorola.studio.android.model.resources.AbstractResourceNode)
	 */
	@Override
	protected boolean canAddChildNode(AbstractResourceNode node) {
		NodeType nodeType = node.getNodeType();
		boolean canAdd = (nodeType == NodeType.String) || (nodeType == NodeType.Color) || (nodeType == NodeType.Dimen)
				|| (nodeType == NodeType.Drawable);

		return canAdd;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.motorola.studio.android.model.resources.AbstractResourceNode#getNodeType
	 * ()
	 */
	@Override
	public NodeType getNodeType() {
		return NodeType.Resources;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.motorola.studio.android.model.resources.AbstractResourceNode#
	 * isAttributeValid(java.lang.String)
	 */
	@Override
	protected boolean isAttributeValid(String attributeName) {
		return false;
	}

}